package org.example.java8.multithreading;

public class NumberPrinter {
    private int number = 1;
    private final Object lock = new Object();

    public void printNumbers() {
        synchronized (lock) {
            while (number <= 10) {
                try {
                    System.out.println(STR."\{Thread.currentThread().getName()} printed: \{number}");
                    number++;
                    lock.notify(); // Notify the other thread
                    if (number <= 10) {
                        lock.wait(); // Current thread waits
                    }
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    System.out.println("Thread interrupted");
                }
            }
        }
    }

    public static void main(String[] args) {
        NumberPrinter printer = new NumberPrinter();

        Runnable printTask = printer::printNumbers;

        Thread thread1 = new Thread(printTask, "Thread 1");
        Thread thread2 = new Thread(printTask, "Thread 2");

        thread1.start();
        thread2.start();
    }
}
