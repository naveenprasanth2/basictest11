package org.example.challanges;

import java.util.NoSuchElementException;
import java.util.Optional;

public class OptionalPractise {
    public static void main(String[] args) {
        Optional<String> name = getNameFromDatabase("1234");
        name.ifPresentOrElse(System.out::println, () -> {
            throw new NoSuchElementException("No name found");
        });
    }

    private static Optional<String> getNameFromDatabase(String number) {
        if (number.equals("123")){
            return Optional.of("naveen prasanth");
        }else {
            return Optional.empty();
        }
    }
}
