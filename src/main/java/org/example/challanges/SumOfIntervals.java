package org.example.challanges;

import java.util.stream.IntStream;

public class SumOfIntervals {
    public static void main(String[] args) {
       long sum = IntStream.rangeClosed(15, 20).sum();
        System.out.println(sum);
    }
}
