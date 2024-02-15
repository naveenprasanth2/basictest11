package org.example.challanges;

public class RandomGenerator {

    long seed;

    public RandomGenerator(long seed) {
        this.seed = seed;
    }

    public int randomGenerator(int min, int max) {
        int range = (max - min) + 1;
        int modVal = (int) (seed % range);
        return modVal + min;
    }

    public static void main(String[] args) {

        RandomGenerator randomGenerator = new RandomGenerator(System.currentTimeMillis());
        int val = randomGenerator.randomGenerator(20, 40);

        System.out.println(val);
    }
}
