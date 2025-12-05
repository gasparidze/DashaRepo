package org.example.concurrency;

public class Starter {

    public static void main(String[] args) {
        System.out.println("current thread name: %s".formatted(Thread.currentThread().getName()));

        NewThread1 newThread1 = new NewThread1(); // new
        newThread1.setPriority(10);
        newThread1.start(); // runnable

        NewThreadImpl newThreadImpl = new NewThreadImpl();
        Thread thread2 = new Thread(newThreadImpl);
        newThread1.setPriority(9);
        thread2.start();

        System.out.println("current thread name: %s".formatted(Thread.currentThread().getName()));
    }
}

class NewThread1 extends Thread{
    @Override
    public void run(){
        System.out.println("current thread name: %s".formatted(Thread.currentThread().getName()));
    }
}

class NewThreadImpl implements Runnable{
    @Override
    public void run(){
        System.out.println("current thread name: %s".formatted(Thread.currentThread().getName()));
    }
}
