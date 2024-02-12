package org.example.threading;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class RandomGeneration {
    public static void main(String[] args) {
//        int val = new Random().nextInt(0, 10);
        int val = ThreadLocalRandom.current().nextInt(10, 15);
        System.out.println(val);
//        System.out.println(vall);
    }
}
