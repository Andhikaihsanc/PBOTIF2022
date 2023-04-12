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
class A {

    class B { //class B ada di dalam class A 

        void methodPadaB() {
            System.out.println("Hello, saya method di kelas B");
            System.out.println("kelas B berada dalam kelas A");
        }
    }

    void methodPadaA() {
        B b = new B(); //object b diinstance  pada sebuah method di class A 
        System.out.println("Hello, saya method kelas A");
        System.out.println("Saya membuat object dari inner class B");
        b.methodPadaB();
    }
}
