package org.example.annotations;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class EmployeeEval {
    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {
        Employee employee = new Employee(1, 10, "summa");
        Field[] fields = employee.getClass().getDeclaredFields();
        for (Field field : fields) {
            if (field.isAnnotationPresent(MyFieldAnnotation.class)) {
                MyFieldAnnotation annotation = field.getAnnotation(MyFieldAnnotation.class);
                for (int i = 0; i < annotation.repeat(); i++) {
                    System.out.println("naveen");
                }
            }
        }
        Method[]  methods = employee.getClass().getDeclaredMethods();
        for (Method method: methods){
            if(method.isAnnotationPresent(MyMethodAnnotation.class)){
                MyMethodAnnotation myMethodAnnotation = method.getAnnotation(MyMethodAnnotation.class);
                for (int i=0; i<myMethodAnnotation.times(); i++){
                    method.invoke(employee);
                }
            }
        }

    }
}
