package org.example.java.singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Reflection {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Singleton singleton = Singleton.getInstance();

        Class<?> singletonClass  = Class.forName("org.example.java.singleton.Singleton");
        Constructor<?> constructor = singletonClass.getDeclaredConstructor();
        constructor.setAccessible(true);
        Singleton singleton1 = (Singleton) constructor.newInstance();

        System.out.println(singleton.hashCode());
        System.out.println(singleton1.hashCode());
    }
}
