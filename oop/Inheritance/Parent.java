package oop.Inheritance;

public class Parent{
    public int x = 5;
    }
class child extends Parent{
    public int x = 10;
    
    public void info(int x){
        System.out.println("Nilai x sebagai parameter" + x);
        System.out.println("Nilai x sebagai parameter" + x);
        System.out.println("Nilai x sebagai parameter" + x);
    }
}
