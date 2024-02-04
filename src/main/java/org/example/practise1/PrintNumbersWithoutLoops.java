package org.example.practise1;

import java.util.Arrays;

public class PrintNumbersWithoutLoops {
    public static void main(String[] args) {
        Object[] a = new Object[100];
        Arrays.fill(a, new Object() {
            int count = 0;

            @Override
            public String toString() {
                return String.valueOf(++count);
            }

        });

        System.out.println(Arrays.toString(a));
    }
}
