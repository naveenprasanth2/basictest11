package org.example.generic;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Box<T> {
    T object;

    public Box(T object) {
        this.object = object;
    }

    public boolean isEmpty() {
        return object == null;
    }

    public boolean isSameType(Box<?> otherBox) {
        if (this.object == null) {
            return otherBox.object == null;
        }
        return otherBox.object != null && this.object.getClass().equals(otherBox.object.getClass());
    }
}
