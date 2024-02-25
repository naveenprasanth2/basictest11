package org.example.singletonprac;

import java.io.*;

public class SingletonSerial {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Singleton singleton = Singleton.getInstance();
        System.out.println(singleton.hashCode());

        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(".//test.ser"));
        objectOutputStream.writeObject(singleton);

        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(".//test.ser"));
        Singleton singleton1 = (Singleton) objectInputStream.readObject();
        System.out.println(singleton1.hashCode());
    }
}
