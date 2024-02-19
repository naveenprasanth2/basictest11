package org.example.java8.multithreading;

public class MyNumberPrinter implements Runnable{
    int number = 1;
    private final Object object = new Object();

    private void printNumbers(){
        synchronized (object){
            if(number <= 10){
                if(number%2 == 0)
                    System.out.println(STR."The thread \{Thread.currentThread().getName()} printed is \{number}");
                else System.out.println(STR."The thread \{Thread.currentThread().getName()} printed is \{number}");
            }
        }
    }

    @Override
    public void run() {

    }
}
