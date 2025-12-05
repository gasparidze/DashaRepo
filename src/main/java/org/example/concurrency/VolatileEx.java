package org.example.concurrency;

public class VolatileEx {
    private static volatile boolean flag = true; // НЕТ volatile!

    public static void main(String[] args) throws InterruptedException {
        Thread workerThread = new Thread(() -> {
            int counter = 0;
            while (flag) {
                counter++;
                // Без какой-либо синхронизации поток может никогда не увидеть изменение flag
            }
            System.out.println("Worker thread finished. Counter: " + counter);
        });

        workerThread.start();
        Thread.sleep(1000); // Даем время workerThread начать работу

        System.out.println("Main thread changing flag to false");
        flag = false;

        workerThread.join();
        System.out.println("Main thread finished");
    }
}
