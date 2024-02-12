package org.example.threading;

import java.util.stream.IntStream;

public class ThreadDemoLambda {
    public static void main(String[] args) throws InterruptedException {
        Runnable r1 = () -> IntStream.rangeClosed(0, 5).map(_ -> {
            try {
                Thread.sleep(50);
            } catch (Exception _) {

            }
            return 0;
        }).forEach(_ -> System.out.println("hi"));
        Runnable r2 = () -> IntStream.rangeClosed(0, 5).map(_ -> {
            try {
                Thread.sleep(50);
            } catch (Exception _) {

            }
            return 0;
        }).forEach(_ -> System.out.println("hello"));

        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);
        t1.setPriority(1);
        t2.setPriority(10);
        t1.setName("Hi Thread");
        t2.setName("Hello Thread");
        System.out.println(STR."T1 name is \{t1.getName()}");
        System.out.println(STR."T2 name is \{t2.getName()}");

        t1.start();
        System.out.println(STR."T1 \{t1.isAlive()}");
        t2.start();
        System.out.println(STR."T2 \{t2.isAlive()}");
        t1.join();
        System.out.println(STR."T1 \{t1.isAlive()}");
        t2.join();
        System.out.println(STR."T2 \{t2.isAlive()}");
        System.out.println("summa");
    }
}
