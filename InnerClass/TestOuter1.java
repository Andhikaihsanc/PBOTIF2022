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
public class TestOuter1 {

    static int data = 30;

    static class Inner {

        void msg() {
            System.out.println("data is " + data);
        }
    }

    public static void main(String args[]) {
        TestOuter1.Inner obj = new TestOuter1.Inner();
        obj.msg();
    }
}
