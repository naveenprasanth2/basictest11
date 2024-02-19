package org.example.java8.generics;

import java.util.List;

public class NumberSum<T extends Number> {
    public double sumOfList(List<T> list) {
        return list.stream().mapToDouble(x -> Double.parseDouble(x.toString())).sum();
    }

    public double sumOfListUsingWildCard(List<? extends Number> list) {
        return list.stream().mapToDouble(x -> Double.parseDouble(x.toString())).sum();
    }


    public static void main(String[] args) {
        NumberSum<Integer> numberSum = new NumberSum<>();
        System.out.println(numberSum.sumOfList(List.of(1, 2, 3, 4, 10)));
        System.out.println(numberSum.sumOfListUsingWildCard(List.of(1, 2, 3, 4, 10)));
    }
}
