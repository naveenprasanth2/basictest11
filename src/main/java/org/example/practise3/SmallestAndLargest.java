package org.example.practise3;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Optional;

public class SmallestAndLargest {
    public static void main(String[] args) {
        int[] a = {-1, 1, 2, 3, 4, 5, 6, 7};

        int min = Arrays.stream(a).boxed().min(Comparator.naturalOrder()).orElseThrow();
        int max = Arrays.stream(a).boxed().max(Comparator.naturalOrder()).orElseThrow();

//        System.out.println(max);
//        System.out.println(min);

        int newMin = a[0];

        for (int i = 0; i<a.length; i++){
            if(a[i] < newMin)
                newMin = a[i];
        }

        int newMax = a[0];

        for (int i = 0; i<a.length; i++){
            if(a[i] > newMax)
                newMax = a[i];
        }

        System.out.println(newMin);
        System.out.println(newMax);
    }
}
