package org.example.sealed.practise;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public non-sealed class Square extends Shape {
    private final double side;
}
