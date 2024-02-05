package org.example.practise1;

public class PrintNumbersWOLoop {
    public static void main(String[] args) {
        int max = 100;
        printWithoutLoop(1, max);

    }

    private static void printWithoutLoop(int value, int max) {
        if (value <= max) {
            System.out.println(value);
            printWithoutLoop(++value, max);
        }
    }
}
