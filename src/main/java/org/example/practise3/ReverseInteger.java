package org.example.practise3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

public class ReverseInteger {
    private static int value;

    public static void main(String[] args) {
        int a = 897987987;
//        List<String> test = new ArrayList<>(Stream.of(String.valueOf(a).split("")).toList());
//        Collections.reverse(test);
//        System.out.println(test);
//        reverse(777779999);
        reverseNumber(787878);
        System.out.println(value);
    }

//    private static void reverse(int number){
//        if(number > 0){
//            System.out.printf(String.valueOf(number%10));
//            number /= 10;
//            reverse(number);
//        }
//    }

    private static void reverseNumber(int number) {
        if (number > 0) {
            value = ((value * 10) + number % 10);
            reverseNumber(number/10);

        }
    }
}
