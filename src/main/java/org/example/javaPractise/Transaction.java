package org.example.javaPractise;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class Transaction {
    private int value;
    private int year;
    private String city;
}
