package org.example.practise3;

public class PrintNumbersWOLoop {
    public static void main(String[] args) {
        printNumbersOnRange(1, 100);
    }

    private static void printNumbersOnRange(int start, int end){
        if(start < end){
            System.out.println(start);
            printNumbersOnRange(++start, end);
        }else {
            System.out.println(start);
        }
    }
}
