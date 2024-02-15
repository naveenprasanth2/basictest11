package org.example.challanges;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class MyRandom {
    long variableValue;

    public int getRandom(int min, int max) {
        int range = (max - min) + 1;
        int randomNumber = (int) (variableValue % range);
        return min + randomNumber;
    }

    public static void main(String[] args) {
        MyRandom myRandom = new MyRandom(System.currentTimeMillis());
        System.out.println(myRandom.getRandom(1000, 1002));
    }
}
