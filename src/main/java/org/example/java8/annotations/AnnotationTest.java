package org.example.java8.annotations;

import org.example.annotations.MyMethodAnnotation;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

@ClassAnnotation
public class AnnotationTest {
    public static void main(String[] args) {
        Method[] methods =  MethodAnnotation.class.getMethods();
        for (Method method: methods){
            MyMethodAnnotation myMethodAnnotation = method.getAnnotation(MyMethodAnnotation.class);
            while (myMethodAnnotation.times()!=0){
                System.out.println("test");
            }
        }
    }
}
