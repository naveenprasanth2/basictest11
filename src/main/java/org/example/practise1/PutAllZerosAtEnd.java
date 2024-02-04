package org.example.practise1;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class PutAllZerosAtEnd {
    public static void main(String[] args) {
        int[] a = {2, 3, 0, 0, 5, 0, 8};

        List<Integer> test;

        Supplier<Stream<Integer>> stream = () -> Arrays.stream(a).boxed();

        test = stream.get().filter(x -> x != 0).collect(Collectors.toList());

        long count = stream.get().filter(x -> x == 0).count();

        IntStream.rangeClosed(1, (int) count).forEach(x -> test.add(0));

        System.out.println(test);

    }
}
