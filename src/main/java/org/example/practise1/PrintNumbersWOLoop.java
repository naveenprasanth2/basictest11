package org.example.practise1;

public class PrintNumbersWOLoop {
    static int max = 100;
    public static void main(String[] args) {
        printWithoutLoop(1);

    }

    private static void printWithoutLoop(int value){
        if(value <= max){
            System.out.println(value);
            printWithoutLoop(++value);
        }
    }
}
