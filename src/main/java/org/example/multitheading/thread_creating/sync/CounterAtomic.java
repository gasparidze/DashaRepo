package org.example.multitheading.thread_creating.sync;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * AtomicInteger - класс, который предоставляет возможность работать с целочисленным значением int, используя атомарные операции
 */
public class CounterAtomic {
    private AtomicInteger count = new AtomicInteger(0);

    public void increment(){
        count.incrementAndGet();
    }

    public AtomicInteger getCount() {
        return count;
    }
}
