package org.example.threading;

import java.util.Arrays;

public class MyThreadRun implements Runnable{
    @Override
    public void run() {
        int[] a = {1, 2, 3, 4, 5};
        for (int i = 0; i < a.length; i++) {
            a[i] = a[i] * 2;
        }
        System.out.println(Arrays.toString(a));
    }

    public static void main(String[] args) {
        Runnable t1 = new MyThreadRun();
        t1.run();
    }
}
