package org.example.sealed.challenge;

public sealed class Elephant extends Animal permits ElephantBaby {
    public Elephant(String name, String work) {
        super(name, work);
    }
}
