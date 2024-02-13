package org.example.singleton;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class BreakSerializable {

    public static void main(String[] args) throws Exception {
        Singleton singleton = Singleton.getInstance();

        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("\\test.ser"));
        objectOutputStream.writeObject(singleton);

        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("\\test.ser"));
        Singleton singleton1 = (Singleton) objectInputStream.readObject();

        System.out.println(singleton1.hashCode());
        System.out.println(singleton.hashCode());
    }
}
