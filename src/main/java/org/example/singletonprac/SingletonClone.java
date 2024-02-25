package org.example.singletonprac;

public class SingletonClone {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        System.out.println(singleton.hashCode());

        System.out.println(singleton.clone().hashCode());
    }
}
