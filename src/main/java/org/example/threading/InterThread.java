package org.example.threading;

import lombok.Getter;
import lombok.Setter;
import lombok.Synchronized;

@Getter
@Setter
class Q {
    int num;

    @Synchronized
    public void setNum(int num) {
        this.num = num;
    }
}

class Producer implements Runnable {

    Q q;

    public Producer(Q q) {
        this.q = q;
    }

    @Override
    public void run() {
        int i = 0;
        while (true) {
            q.setNum(i++);
            try {
                Thread.sleep(1000);
            } catch (Exception _) {
            }
        }
    }
}

class Consumer implements Runnable {

    Q q;

    public Consumer(Q q) {
        this.q = q;
    }

    @Override
    public void run() {
        int i = 0;
        while (true) {
            System.out.println(q.getNum());
            try {
                Thread.sleep(1000);
            } catch (Exception _) {
            }
        }
    }
}

public class InterThread {
    public static void main(String[] args) {

    }
}
