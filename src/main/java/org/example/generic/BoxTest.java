package org.example.generic;

public class BoxTest {
    public static void main(String[] args) {
        // Create instances of Box storing different types of objects
        Box<Integer> integerBox = new Box<>(5);
        Box<String> stringBox = new Box<>("Hello");
        Box<Double> doubleBox = new Box<>(3.14);

        // Test the methods
        System.out.println(STR."Value in integerBox: \{integerBox.getObject()}");
        System.out.println(STR."Value in stringBox: \{stringBox.getObject()}");
        System.out.println(STR."Value in doubleBox: \{doubleBox.getObject()}");

        System.out.println(STR."Is integerBox empty? \{integerBox.isEmpty()}");
        System.out.println(STR."Is stringBox empty? \{stringBox.isEmpty()}");
        System.out.println(STR."Is doubleBox empty? \{doubleBox.isEmpty()}");

        Box<String> anotherStringBox = new Box<>("World");
        System.out.println(STR."Is stringBox same type as anotherStringBox? \{stringBox.isSameType(anotherStringBox)}");
    }
    }