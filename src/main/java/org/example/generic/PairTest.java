package org.example.generic;

public class PairTest {
    public static void main(String[] args) {
        Pair<Integer, String> pair = new Pair<>(10, "Hello");

        System.out.println(STR."Original pair: \{pair.getFirst()}, \{pair.getSecond()}");

        pair.swap();

        System.out.println(STR."Swapped pair: \{pair.getFirst()}, \{pair.getSecond()}");
    }
    }

