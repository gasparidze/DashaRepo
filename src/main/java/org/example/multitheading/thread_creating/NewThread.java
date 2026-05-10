package org.example.multitheading.thread_creating;

public class NewThread extends Thread{
    @Override
    public void run() {
        System.out.println("Starting new thread: " + getName());
    }
}
