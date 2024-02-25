package org.example.singletonprac;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class SingletonEval {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Singleton singleton = Singleton.getInstance();
        System.out.println(singleton.hashCode());

        Class<?> className = Class.forName("org.example.singletonprac.Singleton");
        Constructor<?> constructor = className.getDeclaredConstructor();
        constructor.setAccessible(true);
        Singleton singleton1 = (Singleton) constructor.newInstance();
        System.out.println(singleton1.hashCode());
    }
}
