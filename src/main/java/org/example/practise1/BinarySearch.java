package org.example.practise1;

import java.util.List;

public class BinarySearch {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int element = 7;

        int left = 0;
        int right = a.length;
        int position = -1;

        while (left <= right) {
            int middle =( left+ right) / 2;
            if (a[middle] == element) {
                position = middle;
                break;
            } else if (a[middle] > element) {
                right = middle - 1;
            } else if (a[middle] < element) {
                left = middle + 1;
            }
        }

        System.out.println(position);


    }
}
