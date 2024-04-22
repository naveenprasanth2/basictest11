package org.example.java.logics;

import java.util.List;
import java.util.regex.Pattern;

public class FilterName {
    public static void main(String[] args) {
        List<String> names = List.of("James", "John", "Sarah", "Jessica", "Michael");
        names.stream().filter(x -> Pattern.matches("^J[a-z]+$", x)).forEach(System.out::println);
    }
}
