package org.example.practise3;

public class PairTest {
    public static void main(String[] args) {
        Pair<Integer> pair = new Pair<>();
        pair.setFirst(1);
        pair.setSecond(2);
        pair.swap();

        System.out.println(pair.getFirst());
        System.out.println(pair.getSecond());
    }
}
