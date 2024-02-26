package org.example.generic;

import java.util.Arrays;

public class GenericArray {

    public static <T> void printArray(T[] array) {
        Arrays.stream(array).forEach(System.out::println);
    }

    public static void main(String[] args) {
        Integer[] test = {1, 2, 3, 4};
        printArray(test);
    }
}
