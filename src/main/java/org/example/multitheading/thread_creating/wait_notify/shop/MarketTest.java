package org.example.multitheading.thread_creating.wait_notify.shop;

public class MarketTest {
    public static void main(String[] args) {
        Market market = new Market();
        Thread consumerThread = new Thread(new Consumer(market));
        Thread producerThread = new Thread(new Producer(market));

        consumerThread.start();
        producerThread.start();
    }
}
