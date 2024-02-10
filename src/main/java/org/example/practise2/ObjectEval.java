package org.example.practise2;

public class ObjectEval {
    public static void main(String[] args) {
        Animal cat = new Cat();
        cat.test();
        Cat cat1 = null;
        if(cat instanceof Cat){
            cat1 = ((Cat) cat);
        }
        cat1.summa();
        System.out.println(cat.test);
    }
}
