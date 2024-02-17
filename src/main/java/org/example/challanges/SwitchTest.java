package org.example.challanges;

public class SwitchTest {
    public static void main(String[] args) {
        int dayOfWeek = 5;

        String message = switch (dayOfWeek){
            case 1 -> "Its Sunday";
            case 2 -> "Its Monday";
            case 3 -> "Its Tuesday";
            case 4 -> "Its Wednesday";
            case 5 -> "Its Thursday";
            case 6 -> "Its Friday";
            case 7 -> "Its Saturday";
            default -> "its not found";
        };

        System.out.println(message);
    }
}

