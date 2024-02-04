package org.example.practise1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

import static java.lang.StringTemplate.STR;

public class ReverseString {
    public static void main(String[] args) {
        String a = "Hello Good Morning";

       List<String> test = new ArrayList<>(Stream.of(a.split(" ")).toList());
        Collections.reverse(test);
        test.stream().map(x -> STR."\{x} ").forEach(System.out::print);
    }
}
