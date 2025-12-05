package org.example.concurrency;

import java.util.concurrent.atomic.AtomicInteger;

public class CounterEx {
    private static AtomicInteger counter = new AtomicInteger(0);
    private static int a = 0;
    public static void main(String[] args) {
//        Thread workerThread = new Thread(() -> {
//            a++;
//            System.out.println("workerThread: " + a);
//        });
//
//
//        Thread workerThread1 = new Thread(() -> {
//            a++;
//            System.out.println("workerThread1: " + a);
//        });
//
//        Thread workerThread2 = new Thread(() -> {
//            a++;
//            System.out.println("workerThread2: " + a);
//        });
//
//        Thread workerThread3 = new Thread(() -> {
//            a++;
//            System.out.println("workerThread3: " + a);
//        });

//        workerThread.start();
//        workerThread1.start();
//        workerThread2.start();
//        workerThread3.start();

        for (int i = 0; i < 20; i++) {
            int finalI = i + 1;
            new Thread(() -> {
//                int digit = counter.incrementAndGet();
                increment();
                System.out.println("workerThread " + finalI + ": " + a);
            }).start();
        }
    }

    private static synchronized void increment() {
        a++;
    }
}
