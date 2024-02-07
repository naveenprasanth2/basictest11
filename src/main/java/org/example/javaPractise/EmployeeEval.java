package org.example.javaPractise;

import java.time.LocalDate;
import java.util.Comparator;
import java.util.List;

public class EmployeeEval {
    public static void main(String[] args) {
        Employee e1 = Employee.builder().name("naveen").department("mechanical")
                .salary(25000).joiningDate(LocalDate.ofYearDay(2012, 200)).build();
        Employee e2 = Employee.builder().name("suman").department("civil")
                .salary(25000).joiningDate(LocalDate.ofYearDay(2013, 100)).build();
        Employee e3 = Employee.builder().name("dinesh").department("electric")
                .salary(25000).joiningDate(LocalDate.ofYearDay(2015, 300)).build();
        Employee e4 = Employee.builder().name("rajesh").department("mechanical")
                .salary(35000).joiningDate(LocalDate.ofYearDay(2017, 50)).build();
        Employee e5 = Employee.builder().name("suresh").department("mechanical")
                .salary(15000).joiningDate(LocalDate.ofYearDay(2019, 60)).build();

        List<Employee> test = List.of(e1, e2, e3, e4, e5);

        test.stream().filter(x -> x.getDepartment().equals("mechanical"))
                .sorted(Comparator.comparingDouble(Employee::getSalary).reversed())
                .map(Employee::getName).forEach(System.out::println);
    }
}
