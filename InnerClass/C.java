/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InnerClass;

/**
 *
 * @author Andhika
 */
public class C {

    public static void main(String[] args) {
        A.B b = new A().new B(); //kelas B dibuat di luar kelas A 
        b.methodPadaB();
        A a = new A();
        a.methodPadaA();
    }
}
