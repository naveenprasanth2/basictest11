package org.example.java8.innner_outer;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class OuterClass {
    int value;
    @Getter
    @Setter
    public static class InnerClass{
        int summa;
    }
}
