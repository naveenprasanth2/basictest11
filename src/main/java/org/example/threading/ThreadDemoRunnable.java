package org.example.threading;

class His implements Runnable {
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

class Hellos implements Runnable {
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


public class ThreadDemoRunnable {

    public static void main(String[] args) {
        Runnable hi = new His();
        Runnable hello = new Hellos();

        Thread t1 = new Thread(hi);
        Thread t2 = new Thread(hello);

        t1.start();
        t2.start();
    }
}
