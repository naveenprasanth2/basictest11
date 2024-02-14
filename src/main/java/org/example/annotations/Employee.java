package org.example.annotations;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@MyClassAnnotation
public class Employee {
    private int id;
    @MyFieldAnnotation
    private int age;
    private String name;
    @MyMethodAnnotation(times = 10)
    public void test(){
        System.out.println(name);
    }
}
