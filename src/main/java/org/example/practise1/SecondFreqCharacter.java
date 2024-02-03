package org.example.practise1;

import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SecondFreqCharacter {
    public static void main(String[] args) {
        String name = "Bananaookokokokokokokokokokok";

        List<Map.Entry<String, Long>> test = Stream.of(name.split("")).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .sorted((x1, x2) -> {
                    if (!Objects.equals(x1.getValue(), x2.getValue())) {
                        return ((int) (x2.getValue() - x1.getValue()));
                    } else {
                        return x1.getKey().compareTo(x2.getKey());
                    }
                })
                .collect(Collectors.toList());

        System.out.println(test);
        test.stream().skip(test.size() - 1)
                .findFirst()
                .ifPresentOrElse(System.out::println, () -> {
                    throw new NoSuchElementException();
                });
    }
}
