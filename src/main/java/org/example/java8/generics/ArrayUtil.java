package org.example.java8.generics;

import java.util.Arrays;

public class ArrayUtil<T> {
    public T[] swap(T[] array1, int first, int last) {
        T firstElement = Arrays.stream(array1).skip(first).findFirst().orElseThrow();
        T lastElement = Arrays.stream(array1).skip(last).findFirst().orElseThrow();
        array1[first ] = lastElement;
        array1[last] = firstElement;
        return array1;
    }

    public static void main(String[] args) {
        ArrayUtil<String> arrayUtil = new ArrayUtil<>();
        String[] words = {"apple", "banana", "cherry", "date", "elderberry"};
        System.out.println(Arrays.toString(arrayUtil.swap(words, 0, 4)));
    }
}
