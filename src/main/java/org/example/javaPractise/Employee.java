package org.example.javaPractise;

import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class Employee {
    private String name;
    private String department;
    private double salary;
    private LocalDate joiningDate;
}
