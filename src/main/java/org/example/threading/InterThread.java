package org.example.threading;

class Q {
    int num;
    boolean isValueSet = false;

    public synchronized void put(int num) {
        if (isValueSet) {
            try {
                wait();
            } catch (InterruptedException _) {
            }
        }
        this.num = num;
        isValueSet = true;
        System.out.println(STR."The value PUT is \{this.num}");
        notify();
    }

    public synchronized void get() {
        if (!isValueSet) {
            try {
                wait();
            } catch (InterruptedException _) {

            }
        }
        System.out.println(STR."The value GOT is \{num}");
        isValueSet = false;
        notify();
    }
}


class Producer implements Runnable {
    Q q;

    public Producer(Q q) {
        this.q = q;
        Thread t1 = new Thread(this, "Producer");
        t1.start();
    }

    @Override
    public void run() {
        int i = 0;
        while (true) {
            q.put(i++);
            try {
                MyThread.sleep(1000);
            } catch (InterruptedException _) {
            }
        }
    }
}


class Consumer implements Runnable {
    Q q;

    public Consumer(Q q) {
        this.q = q;
        Thread t2 = new Thread(this, "Consumer");
        t2.start();
    }

    @Override
    public void run() {
        while (true) {
            q.get();
            try {
                Thread.sleep(5000);
            } catch (InterruptedException _) {

            }
        }
    }
}

public class InterThread {

    public static void main(String[] args) {
        Q q = new Q();
        new Producer(q);
        new Consumer(q);
    }
}
