package org.example.challanges;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class BuySell {
    public static void main(String[] args) {
        List<Integer> list = List.of(1, 7, 3, 6, 4, 5, 8, 9);
        List<Integer> resultList = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            int val = list.get(i);
            IntStream.range(i, list.size()).map(x -> val - list.get(x)).forEach(resultList::add);
        }
        int result = resultList.stream().mapToInt(Integer::intValue).max().orElseThrow();
        System.out.println(result);
    }
}
