package org.example.javaPractise;

import java.lang.reflect.Array;
import java.util.Arrays;

public class GenericArrayEval {
    public static void main(String[] args) {
        Integer[] a = {1, 2, 3};
        Integer[] b = {4, 5, 6};
        Integer[] result = mergeArray(a, b);
        System.out.println((Arrays.toString(result)));
    }


    public static <T> T[] mergeArray(T[] array1, T[] array2) {
        if (array1 == null || array2 == null) {
            throw new IllegalArgumentException();
        }

        Class<?> componentType = array1.getClass().getComponentType();
        T[] array3 = (T[]) Array.newInstance(componentType, array1.length+ array2.length);

        System.arraycopy(array1, 0, array3, 0, array1.length);
        System.arraycopy(array2, 0, array3, array1.length, array2.length);

        return array3;
    }
}
