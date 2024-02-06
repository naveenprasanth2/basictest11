package org.example.practise2;

import java.util.Comparator;

public class Labrador extends Dog implements Comparable<Labrador> {

    int val;
    int summa;

    String name;
    @Override
    public int compareTo(Labrador o) {
        return this.val - o.val;
    }

    Comparator<Labrador> NEW_COMPARATOR = Comparator.comparing(o -> o.name);

    public static void main(String[] args) {
        Labrador labrador = new Labrador();
        Dog dog = new Dog();
        System.out.println(dog.test());
        labrador.test();
    }
}
