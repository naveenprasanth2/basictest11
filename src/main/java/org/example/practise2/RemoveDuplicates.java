package org.example.practise2;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

public class RemoveDuplicates {
    public static void main(String[] args) {
        List<String> names = List.of("naveen", "prasanth", "shiva", "naveen");
//        names.stream().filter(x -> Collections.frequency(names, x) >= 2).distinct().forEach(System.out::println);
        Optional<String> test = Optional.empty();
        System.out.println(test.orElseThrow(ArrayIndexOutOfBoundsException::new));
    }
}
