package org.example.javaPractise;

import java.util.ArrayList;

public class LinkedListExample<T>{
    public Node<T> head = null;
    public Node<T> tail = null;

    static class Node<T> {
        T element;
        Node<T> next;

        Node(T element) {
            this.element = element;
            this.next = null;
        }
    }

    public void addElement(T element) {
        Node<T> newNode = new Node<>(element);
        if (head == null) {
            head = newNode;
        } else {
            tail.next = newNode;
        }
        tail = newNode;
    }

    public void deleteElement(T element) {
        Node<T> current = head;
        if (head.element.equals(element)) {
            head = head.next;
        }
        while (current.next != null) {
            if (current.next.element.equals(element)) {
                current.next = current.next.next;
                break;
            } else {
                current = current.next;
            }
        }
    }

    public static void main(String[] args) {
        LinkedListExample<Integer> linkedListExample = new LinkedListExample<>();
        linkedListExample.addElement(1);
        linkedListExample.addElement(2);
        linkedListExample.addElement(56);
        linkedListExample.addElement(3);

        linkedListExample.deleteElement(56);
        linkedListExample.deleteElement(3);

        Node<Integer> current = linkedListExample.head;
        while (current != null) {
            System.out.println(current.element);
            current = current.next;
        }

    
    }
}
