package org.example.practise3;

import java.util.Arrays;

public class findMissingNumber {
    public static void main(String[] args) {
        int[] a = {-1, 1, 2, 3, 4, 5, 6, 7};
        int sum = 0;

        for (int j : a) {
            sum += j;
        }

        int normalSum = 0;
        for (int i = a[0]; i <= a[a.length - 1]; i++) {
            normalSum += i;
        }
        System.out.println(normalSum);
        System.out.println(sum);

        System.out.println(normalSum - sum);
    }
}
