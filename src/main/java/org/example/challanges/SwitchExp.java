package org.example.challanges;

import java.util.List;

public class SwitchExp {
    public static void main(String[] args) {
        List<Object> items = List.of("Hello", 42, new Person("John Doe"), 3.14);
        items.forEach(x -> {
            switch (x){
                case String s -> System.out.println(STR."String \{x} \{s.length()}");
                case Integer i -> System.out.println((i%2 == 0) ? "even": "odd");
                case Person p -> System.out.println(p.name());
                default -> System.out.println("Not belongs to any type");
            }
        });
    }
}
