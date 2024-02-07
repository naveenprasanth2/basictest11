package org.example.javaPractise;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.Stream;

public class GenericArray {
    public static void main(String[] args) {
        Integer[] intArray1 = {1, 2, 3};
        Integer[] intArray2 = {4, 5, 6};
        Integer[] mergedIntArray = mergeArrays(intArray1, intArray2);
        System.out.println(Arrays.toString(mergedIntArray));
    }

    public static <T> T[] mergeArrays(T[] array1, T[] array2) {

        if(array1 == null || array2 == null){
            throw new IllegalArgumentException();
        }

        Class<?> arrayComponentType = array1.getClass().getComponentType();
        T[] array3 = (T[]) Array.newInstance(arrayComponentType, array1.length + array2.length);

        System.arraycopy(array1, 0, array3, 0, array1.length);
        System.arraycopy(array2, 0, array3, array1.length, array2.length);
        return array3;
    }
}
