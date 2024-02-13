package org.example.singleton;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Employee {
    private final int id;
    private int age;
    private String department;

    public Employee(int id) {
        this.id = id;
    }

    @MethodAnnotation(repeat = 5)
    public void test() {
        System.out.println("summa");
    }
}
