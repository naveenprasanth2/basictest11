package org.example.javaPractise;

import java.util.regex.Pattern;

public class EmailValidator {
    public static void main(String[] args) {
        String email = "example@test.com";

        if (Pattern.matches("^[a-zA-Z]+[0-9]+[.\\-]?[a-zA-Z0-9]*@[a-z]+\\.(com|net|org)+$", email)){
            System.out.println("valid email");
        }else {
            System.out.println("not a valid email");
        }
    }
}
