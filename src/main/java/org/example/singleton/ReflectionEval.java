package org.example.singleton;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.NoSuchElementException;
import java.util.stream.Stream;

@VeryImportant
public class ReflectionEval {
    public static void main(String[] args) throws Exception {
        Employee employee = new Employee(1);
        MethodAnnotation.class.getAnnotation(MethodAnnotation.class);
    }

    public static void testing() {
        Employee employee = new Employee(1);
        Field[] fields = employee.getClass().getDeclaredFields();

        Stream.of(fields).filter(x -> x.getName().equals("id")).findFirst()
                .ifPresentOrElse(System.out::println, () -> {
                    throw new NoSuchElementException();
                });

        Method[] methods = employee.getClass().getDeclaredMethods();
        Stream.of(methods).filter(x -> x.getName().equals("test")).findFirst()
                .ifPresent(x -> {
                    try {
                        x.invoke(employee);
                    } catch (IllegalAccessException e) {
                        throw new RuntimeException(e);
                    } catch (InvocationTargetException e) {
                        throw new RuntimeException(e);
                    }
                });
        Arrays.stream(fields).filter(x -> x.equals("id")).findFirst().ifPresent(x -> {
            x.setAccessible(true);
            try {
                x.set(employee, 5);
            } catch (IllegalAccessException e) {
                throw new RuntimeException(e);
            }
            System.out.println(x);
        });

    }
}
