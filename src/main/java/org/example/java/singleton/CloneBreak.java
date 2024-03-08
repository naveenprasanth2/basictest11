package org.example.java.singleton;

public class CloneBreak {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        Singleton singleton1 = singleton.clone();
        System.out.println(singleton.hashCode());
        System.out.println(singleton1.hashCode());
    }
}
