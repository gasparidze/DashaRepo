package org.example.multitheading.thread_creating;

public class ThreadTest {
    public static void main(String[] args) throws InterruptedException {
        System.out.println(Thread.currentThread().getName());

        NewThread newThread = new NewThread();
        newThread.start();

        Thread runnableThread = new Thread(new RunnableThread());
        runnableThread.start();

        newThread.join();
        runnableThread.join();

        System.out.println("Main finished");
        System.out.println("Main finished");
        System.out.println("Main finished");
        System.out.println("Main finished");
        System.out.println("Main finished");
        System.out.println("Main finished");
        System.out.println("Main finished");
        System.out.println("Main finished");
        System.out.println("Main finished");
        System.out.println("Main finished");
    }
}
