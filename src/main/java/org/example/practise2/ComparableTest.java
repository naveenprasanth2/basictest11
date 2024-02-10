package org.example.practise2;

import java.util.Arrays;

public class ComparableTest {
    public static void main(String[] args) {
        ComparableImpl c1 = new ComparableImpl(5);
        ComparableImpl c2 = new ComparableImpl(11);
        ComparableImpl c3 = new ComparableImpl(90);

        ComparableImpl[] c4 = {c1, c2, c3};

        System.out.println(Arrays.toString(c4));

        Arrays.sort(c4, ComparableImpl.REVERSE);

        System.out.println(Arrays.toString(c4));
    }
}
