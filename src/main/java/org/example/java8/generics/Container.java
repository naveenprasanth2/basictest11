package org.example.java8.generics;

public class Container<T> implements Comparable<T> {
    private final T value;

    public Container(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

//    public boolean compareContainers(Container<T> container1, Container<T> container2) {
////        return container1.compareTo(container2);
//    }

    @Override
    public int compareTo(T o) {
        if (o.getClass().equals(this.getClass())) {
            if (((int) (this.getValue())) == ((int) ((Container<?>) o).getValue())) {
                return 1;
            } else if (((int) (this.getValue())) < ((int) ((Container<?>) o).getValue())) {
                return -1;
            } else {
                return 0;
            }
        }
        return 0;
    }
}
