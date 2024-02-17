package org.example.java_practise;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class MergeOverLapping {
    public static void main(String[] args) {
        List<List<Integer>> test = new ArrayList<>(List.of(
                List.of(4, 5),
                List.of(1, 4),
                List.of(6, 10),
                List.of(11, 13),
                List.of(12, 15),
                List.of(16, 18),
                List.of(2, 3)
        ));
        test.sort(Comparator.comparingInt(List::getFirst));
        System.out.println(test);
        for (int i = 0; i < test.size() - 1; i++) {
            if (test.get(i).getLast() >= test.get(i + 1).getFirst() &&
                    test.get(i).getFirst() <= test.get(i + 1).getLast() &&
                    test.get(i).getLast() < test.get(i + 1).getLast()
            ) {
                test.add(i, List.of(test.get(i).getFirst(), test.get(i + 1).getLast()));
                test.remove(i + 1);
                test.remove(i + 1);
            }
        }
        System.out.println(test);
    }
}
