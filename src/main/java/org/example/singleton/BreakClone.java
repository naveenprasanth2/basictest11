package org.example.singleton;

public class BreakClone {
    public static void main(String[] args) {
       Singleton singleton = Singleton.getInstance();

       Singleton singleton1 = singleton.clone();

        System.out.println(singleton1.hashCode());
        System.out.println(singleton.hashCode());
    }
}
