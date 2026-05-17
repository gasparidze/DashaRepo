package org.example.multitheading.thread_creating.creating_threads;

public class RunnableThread implements Runnable{
    @Override
    public void run() {
        System.out.println("Starting runnable thread: " + Thread.currentThread().getName());
    }
}