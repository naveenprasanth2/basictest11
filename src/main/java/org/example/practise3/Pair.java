package org.example.practise3;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Pair<T> {
    private T first;
    private T second;

    public void swap() {
        T third = second;
        second = first;
        first = third;
    }
}
