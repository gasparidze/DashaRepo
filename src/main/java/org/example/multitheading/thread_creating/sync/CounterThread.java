package org.example.multitheading.thread_creating.sync;

/**
 * Создадим класс с однгим полем и конструктором для инициалиазации объекта Counter
 *
 * В методе run этого класса в цикле 100 раз вызовем counter.increment()
 */
public class CounterThread extends Thread {
    private final Counter counter;
//        private final CounterAtomic counter;

    public CounterThread(Counter counter){
        this.counter = counter;
    }

//    public CounterThread(CounterAtomic counter){
//        this.counter = counter;
//    }

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            counter.increment();
        }
    }
}
