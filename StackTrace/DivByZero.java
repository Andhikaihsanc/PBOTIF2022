package StackTrace;

public class DivByZero {

    public static void main(String[] args) {
        try {
            pembagian();
        } catch (ArithmeticException ae) {
            StackTraceElement[] se = ae.getStackTrace();
            for (int i = 0; i < se.length; i++) {
                System.out.println("Nama Class:" + se[i].getClassName());
                System.out.println("Nama Method:" + se[i].getMethodName());
            }
        }
    }

    static void pembagian() {
        int i = 10 / 0;
    }
}
