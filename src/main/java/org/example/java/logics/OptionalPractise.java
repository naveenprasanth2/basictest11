package org.example.java.logics;

import java.util.NoSuchElementException;
import java.util.Optional;

public class OptionalPractise {
    public static void main(String[] args) {
        Optional<String> value = getNameFromDatabase("123");
        value.ifPresentOrElse(System.out::println, () -> {
            throw new NoSuchElementException();
        });
    }

    private static Optional<String> getNameFromDatabase(String number) {
        if (number.equals("123")) {
            return Optional.of("naveen");
        } else {
            return Optional.empty();
        }
    }
}
