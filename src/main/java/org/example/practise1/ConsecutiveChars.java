package org.example.practise1;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ConsecutiveChars {
    public static void main(String[] args) {
        String a = "Amazon is a great company as it has AtoooZzz";
        List<String> test = Stream.of(a.replaceAll("\\s", "").split("")).toList();
        HashMap<String, Integer> map = new HashMap<>();
        int count;
        for (int i = 0; i < test.size(); i++) {
            count = 1;
            for (int j = i; j < test.size() - 1; j++) {
                if (test.get(j).equals(test.get(j + 1))) {
                    count++;
                } else {
                    break;
                }
            }
            if (map.containsKey(test.get(i))) {
                map.put(test.get(i), map.get(test.get(i)) > count ? map.get(test.get(i)) : count);
            } else {
                map.put(test.get(i), count);
            }
        }

        System.out.println(map);

        List<Map.Entry<String, Integer>> finalMap = map.entrySet().stream().sorted((x1, x2) -> {
            if (!Objects.equals(x1.getValue(), x2.getValue())) {
                return x2.getValue() - x1.getValue();
            } else {
                return x1.getKey().compareTo(x2.getKey());
            }
        }).toList();

        System.out.println(finalMap);

//        Stream.of(a.replaceAll("\\s", "").split("")).filter(x -> map.get(x) > 2).findFirst().ifPresentOrElse(System.out::println,
//                () -> {
//                    throw new NoSuchElementException();
//                }
//        );
    }
}
