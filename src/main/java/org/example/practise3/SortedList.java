package org.example.practise3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortedList<T> {
    private List<T> list;
    private Comparator<T> comparator;

    public SortedList(Comparator<T> comparator) {
        list = new ArrayList<>();
        this.comparator = comparator;
    }

    public void add(T element) {
        if (list.isEmpty()) {
            list.add(element);
        } else {
            int index = Collections.binarySearch(list, element, comparator);
            if (index < 0) {
                list.add(-index - 1, element);
            } else {
                list.add(index, element);
            }
        }
    }

    public T get(int index) {
        return list.get(index);
    }

    public int size() {
        return this.list.size();
    }
}
