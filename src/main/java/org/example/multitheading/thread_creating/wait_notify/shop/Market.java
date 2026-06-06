package org.example.multitheading.thread_creating.wait_notify.shop;

/**
 *  методы getBread и putBread синхронизированы по this, т.е. по объекту Market, который создали в MarketTest,
 *  поэтому эти 2 метода одновременно работать не могут
 *
 *  Как работает: notify у методов может отрабатывать в холостую, т.е. никакой поток не находится в состоянии ожидания,
 *  а notify срабатывает
 *  Может быть и так, что, например, поток consumer находится в состоянии ожидания, у потока producer срабатыавет notify,
 *  но далее мониор может захватить все также producer, а не consumer, так происходит отому что оба потока активны
 *  и оба борятся за монитор, кто заберет его - это уже непредсказуемо, тут как решит процессор
 *
 *  Важно: notify() не освбождает монитор, монитор освобождается именно после завершения метода
 */
public class Market {
    private int breadCount = 0;

    public synchronized void getBread() {
        while (breadCount < 1) {
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        breadCount--;
        System.out.println("Потребитель купил 1 хлеб");
        System.out.println("Количество хлеба в магазине: " + breadCount);
        notify();
    }

    public synchronized void putBread() {
        // на витрине не может быть более 5 хлебов
        if (breadCount >= 5) {
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        breadCount++;
        System.out.println("Производитель произвел 1 хлеб");
        System.out.println("Количество хлеба в магазине: " + breadCount);
        notify();
    }
}

class Producer implements Runnable {
    private final Market market;

    public Producer(Market market) {
        this.market = market;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            market.putBread();
        }
    }
}

class Consumer implements Runnable {
    private final Market market;

    public Consumer(Market market) {
        this.market = market;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            market.getBread();
        }
    }
}