package org.example.java8.multithreading;

public class MyNumberPrinter {
    int number = 1;
    private final Object object = new Object();

    private void printNumbers() {
        synchronized (object) {
            try {
                while (number <= 10) {
                    System.out.println(STR."The thread \{Thread.currentThread().getName()} printed is \{number}");
                    number++;
                    object.notify();
                    if (number <= 10) {
                        object.wait();
                    }
                }
            } catch (InterruptedException interruptedException) {
                Thread.currentThread().interrupt();
                System.out.println("Thread Interrupted");
            }
        }
    }

    public static void main(String[] args) {
        MyNumberPrinter printer = new MyNumberPrinter();

        Runnable printTask = printer::printNumbers;

        Thread thread1 = new Thread(printTask, "Thread 1");
        Thread thread2 = new Thread(printTask, "Thread 2");

        thread1.start();
        thread2.start();
    }
}
