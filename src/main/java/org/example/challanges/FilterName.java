package org.example.challanges;

import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;

public class FilterName {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("James", "John", "Sarah", "Jessica", "Michael");
        names.stream().filter(x -> Pattern.matches("^J[a-zA-Z]+$", x)).forEach(System.out::println);
    }
}
