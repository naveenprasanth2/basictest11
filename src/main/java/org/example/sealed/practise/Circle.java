package org.example.sealed.practise;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public final class Circle extends Shape {
    private final double radius;
}
