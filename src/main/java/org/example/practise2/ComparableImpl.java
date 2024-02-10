package org.example.practise2;

import lombok.AllArgsConstructor;

import java.util.Comparator;

@AllArgsConstructor
public class ComparableImpl implements Comparable<ComparableImpl>{

    private int number;
    @Override
    public int compareTo(ComparableImpl o) {
        if(o.getClass() == getClass()){
            return this.number - o.number;
        }else {
            throw new IllegalArgumentException();
        }
    }

    public static Comparator<ComparableImpl> REVERSE = (o1, o2) -> o2.number - o1.number;
}
