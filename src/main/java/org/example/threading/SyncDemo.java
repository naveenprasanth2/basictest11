package org.example.threading;

import java.util.stream.IntStream;

class Counter {
    volatile int count;

    public synchronized void incrementCount() {
        count++;
    }
}

public class SyncDemo {

    public static void main(String[] args) throws InterruptedException {
        Counter c = new Counter();
        Thread t1 = new Thread(() -> IntStream.rangeClosed(1, 10000).forEach(_ -> c.incrementCount()));
        Thread t2 = new Thread(() -> IntStream.rangeClosed(1, 10000).forEach(_ -> c.incrementCount()));
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println(STR."count value is \{c.count}");
    }
}
