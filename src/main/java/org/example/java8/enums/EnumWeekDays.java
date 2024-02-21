package org.example.java8.enums;

import lombok.Getter;

@Getter
public enum EnumWeekDays {
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY{
        @Override
        public String toString() {
            return super.toString().toLowerCase();
        }
    }, SATURDAY
}
