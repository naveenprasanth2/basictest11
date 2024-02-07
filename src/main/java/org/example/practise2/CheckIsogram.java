package org.example.practise2;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CheckIsogram {
    public static void main(String[] args) {
        String value = "dialogue";

        List<Map.Entry<String, Long>> test = Stream.of(value.split(""))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream().toList();

        System.out.println(test.stream().map(Map.Entry::getValue).distinct().count() <= 1);

    }
}
