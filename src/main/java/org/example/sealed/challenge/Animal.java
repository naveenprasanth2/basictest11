package org.example.sealed.challenge;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public sealed class Animal permits Lion, Tiger, Elephant {
    private final String name, work;
}
