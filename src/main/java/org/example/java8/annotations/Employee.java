package org.example.java8.annotations;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.example.annotations.MyClassAnnotation;
import org.example.annotations.MyFieldAnnotation;
import org.example.annotations.MyMethodAnnotation;

@Getter
@Setter
@AllArgsConstructor
@MyClassAnnotation
public class Employee {
    private int id;
    @MyFieldAnnotation
    private int age;
    private String name;
    @MethodAnnotation(repeat = 10)
    public void test(){
        System.out.println(name);
    }
}