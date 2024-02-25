package org.example.java8.innner_outer;

public class InnerOuterEval {
    public static void main(String[] args) {
        OuterClass outerClass = new OuterClass();
//        OuterClass.InnerClass innerClass = outerClass.new InnerClass();
        OuterClass.InnerClass innerClass = new OuterClass.InnerClass();
        innerClass.setSumma(8);
        System.out.println(innerClass.getSumma());
    }
}
