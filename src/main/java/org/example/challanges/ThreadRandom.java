package org.example.challanges;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class ThreadRandom {

    long randNumber;

    public int random(int start, int end) {
        int range = (end - start) + 1;
        int randomVal = (int) (randNumber % range);
        return randomVal + start;
    }

    public static void main(String[] args) {
        ThreadRandom threadRandom = new ThreadRandom(System.currentTimeMillis());
        System.out.println(threadRandom.random(100, 101));
    }
}
