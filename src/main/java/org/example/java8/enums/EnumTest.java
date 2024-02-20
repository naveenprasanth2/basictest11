package org.example.java8.enums;

import lombok.Getter;

@Getter
public enum EnumTest {
    naveen(90){
        @Override
        public String toString() {
            return "summa";
        }
    }, prasanth(80), ramasamy(100);
    final int value;
    EnumTest(int value) {
        this.value = value;
    }

}
