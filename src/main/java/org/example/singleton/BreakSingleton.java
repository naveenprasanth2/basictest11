package org.example.singleton;

import java.io.Serializable;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class BreakSingleton {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Singleton singleton = Singleton.getInstance();

        Class<?> singletonClass = Class.forName("org.example.singleton.Singleton");
        Constructor<Singleton> singletonConstructor =(Constructor<Singleton>) singletonClass.getDeclaredConstructor();
        singletonConstructor.setAccessible(true);
        Singleton singleton1 = singletonConstructor.newInstance();

        System.out.println(singleton1.hashCode());
        System.out.println(singleton.hashCode());
    }
}
