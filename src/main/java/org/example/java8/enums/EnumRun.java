package org.example.java8.enums;

public class EnumRun {
    public static void main(String[] args) {
        EnumWeekDays enumWeekDays = EnumWeekDays.FRIDAY;
        System.out.println(enumWeekDays);
        switch (enumWeekDays) {
            case EnumWeekDays.MONDAY -> System.out.println("monday");
            case EnumWeekDays.TUESDAY -> System.out.println("tuesday");
            case EnumWeekDays.WEDNESDAY -> System.out.println("wednesday");
            case EnumWeekDays.THURSDAY -> System.out.println("thursday");
            case EnumWeekDays.FRIDAY -> System.out.println("friday");
            case EnumWeekDays.SATURDAY -> System.out.println("saturday");
            case EnumWeekDays.SUNDAY -> System.out.println("sunday");
            default -> throw new IllegalStateException(STR."Unexpected value: \{enumWeekDays}");
        }
    }
}
