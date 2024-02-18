package org.example.sealed.practise;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public sealed class Rectangle extends Shape permits FilledRectangle, EmptyRectangle {
    private final double length, width;
}
