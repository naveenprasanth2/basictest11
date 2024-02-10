package org.example.practise3;



class Container<T extends StringBuffer>{
    T value;

    public void setValue(T value){
        this.value = value;
    }

    public T getValue(){
        return value;
    }

    public void printType(){
        System.out.println(value.getClass().getName());
    }

}
public class GenericsDemo {
    public static void main(String[] args) {
        Container<StringBuffer> test = new Container<>();
        test.setValue(new StringBuffer("name"));
        test.printType();
    }
}
