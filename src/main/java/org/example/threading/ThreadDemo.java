package org.example.threading;

class Hi extends Thread {
    @Override
    public void run() {
        for (int i = 0; i <= 5; i++) {
            System.out.println("Hi");
            try {
                Thread.sleep(500);
            } catch (Exception _) {

            }
        }
    }
}

class Hello extends Thread {
    @Override
    public void run() {
        for (int i = 0; i <= 5; i++) {
            System.out.println("Hello");
            try {
                Thread.sleep(500);
            } catch (Exception _) {

            }
        }
    }
}


public class ThreadDemo {

    public static void main(String[] args) {
        Hi hi = new Hi();
        Hello hello = new Hello();

        hi.start();
        hello.start();
    }
}
