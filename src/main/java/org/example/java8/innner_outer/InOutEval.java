package org.example.java8.innner_outer;

public class InOutEval {
    public static void main(String[] args) {
        Outer outer = new Outer(5);
        System.out.println(outer.getOuterVar());
//        Outer.Inner inner = outer.new Inner(7);
        Outer.Inner inner = new Outer.Inner(6);
        System.out.println(inner.getInnerVar());
    }
}
