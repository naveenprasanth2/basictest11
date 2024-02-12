package org.example.practise3;

public class SwapStrings {
    public static void main(String[] args) {
        String a = "naveen";
        String b = "prasanth";

        a = a + b;
        b = a.substring(0, b.length() - 2);
        a = a.substring(b.length());

        System.out.println(a);
        System.out.println(b);
    }
}
