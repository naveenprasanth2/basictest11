package org.example.challanges;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class SumOfIntervals {
    public static void main(String[] args) {
       long sum = IntStream.rangeClosed(15, 20).sum();
        System.out.println(sum);

      long sum1 =  IntStream.rangeClosed(28, 31)
                .map(x -> Stream.of(String.valueOf(x).split(""))
                        .mapToInt(Integer::parseInt).sum()).sum();

        System.out.println(sum1);
    }
}
