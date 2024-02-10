package org.example.practise3;

import lombok.Getter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

@Getter
public class SortedListExample<T> {
    private final List<T> list;
    private final Comparator<T> comparator;

    public SortedListExample(Comparator<T> comparator) {
        this.comparator = comparator;
        list = new ArrayList<>();
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
        return list.size();
    }

    public static void main(String[] args) {
        SortedListExample<String> test = new SortedListExample<>(Comparator.<String>reverseOrder());
        test.add("naveea");
        test.add("naveen");
        ArrayList<String> test1 = new ArrayList<>();
        test1.add("naveea");
        test1.add("naveen");
        test1.sort(Comparator.comparing((String o) -> o).reversed());
        System.out.println(test1);
    }
}
