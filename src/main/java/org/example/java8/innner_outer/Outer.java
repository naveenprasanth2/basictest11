package org.example.java8.innner_outer;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class Outer {
    int outerVar;

    @AllArgsConstructor
    @Getter
    @Setter
    public static class Inner {
        int innerVar;
    }
}
