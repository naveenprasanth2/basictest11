package org.example.practise1;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class MaxOfSum {
    public static void main(String[] args) {

        int[] a = {1, 2, 3};

        List<Integer> test = new ArrayList<>();

        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                test.add(a[i] + a[j]);
            }
        }
        test.stream().min((x1, x2) -> x2 - x1).ifPresentOrElse(System.out::println, () -> {
            throw new NoSuchElementException();
        });
    }
}
