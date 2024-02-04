package org.example.practise1;

import java.util.Arrays;

public class WithoutLoopsPrintName {
    public static void main(String[] args) {
        String name = "naveen";
        String[] a = new String[100];
        Arrays.fill(a,name);
        System.out.println(Arrays.toString(a));
    }
}
