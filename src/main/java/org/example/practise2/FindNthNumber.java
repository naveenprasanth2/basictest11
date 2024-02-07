package org.example.practise2;

public class FindNthNumber {
    public static void main(String[] args) {
        int n = 10;
        System.out.println(findFibonacci(n));
    }

    static int findFibonacci(int number) {
        if (number == 0 || number == 1) {
            return number;
        } else {
            return findFibonacci(number - 1) + findFibonacci(number - 2);
        }
    }
}
