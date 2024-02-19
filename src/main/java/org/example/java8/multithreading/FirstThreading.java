package org.example.java8.multithreading;

public class FirstThreading implements Runnable {
    int number = 1;

    public synchronized void printOdd() {
        if (number % 2 != 0)
            System.out.println(STR."this number \{number} is odd");
    }

    public synchronized void printEven() {
        if (number % 2 == 0)
            System.out.println(STR."this number \{number} is even");
    }

    @Override
    public void run() {
        while (number <= 10) {
            printOdd();
            printEven();
            number++;
        }
    }

    public static void main(String[] args) {
        FirstThreading firstThreading = new FirstThreading();
        Thread thread = new Thread(firstThreading);
        Thread thread1 = new Thread(firstThreading);
        thread.start();
        thread1.start();
    }
}
