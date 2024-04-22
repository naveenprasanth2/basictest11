package org.example.hackathon;

class Exception1 extends Exception{
    public Exception1(String message) {
        super(message);
    }
}
class Exception2 extends Exception1{
    public Exception2(String message) {
        super(message+message);
    }
}
public class Main {
    public static void main(String[] args) {
        try{
            throw new Exception2("Error");
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}