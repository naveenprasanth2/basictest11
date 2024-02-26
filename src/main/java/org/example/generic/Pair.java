package org.example.generic;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Pair<T, S> {
    private T first;
    private S second;

    public Pair(T first, S second) {
        this.first = first;
        this.second = second;
    }

    public void swap() {
        if (first.getClass().equals(second.getClass())) {
            T temp = first;
            first = (T) second;
            second = (S) temp;
        } else {
            throw new IllegalArgumentException("Arguments are not of the same type");
        }
    }
}
