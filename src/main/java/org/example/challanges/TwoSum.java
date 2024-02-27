package org.example.challanges;

import java.util.Arrays;
import java.util.List;

public class TwoSum {
    public static void main(String[] args) {
        List<Integer> list = List.of(1, 7, 3, 6, 4, 5, 8, 9);
        int sumVal = 10;
        System.out.println(Arrays.toString(findIndices(list, sumVal)));
    }

    public static int[] findIndices(List<Integer> list, int sumVal) {
        int first, last;
        first = last = -1;
        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i) + list.get(j) == sumVal) {
                    first = i;
                    last = j;
                    break;
                }
            }
            if (first != -1) {
                break;
            }
        }
        int[] val = new int[2];
        val[0] = first;
        val[1] = last;
        return val;
    }
}
