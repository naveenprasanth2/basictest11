package org.example.java8.enums;

import lombok.Getter;

@Getter
public enum EnumWeekDays {

    SUNDAY(10), MONDAY(15),

    TUESDAY(10), WEDNESDAY(10),

    THURSDAY(10), FRIDAY(10),

    SATURDAY(10);
    final int value;

    EnumWeekDays(int value) {
        this.value = value;
    }

}
