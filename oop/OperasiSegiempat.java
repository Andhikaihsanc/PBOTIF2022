package oop;

class Segiempat{
    double panjang;
    double lebar;
    
    Segiempat (double panjang, double lebar){
        this.panjang = panjang;
        this.lebar = lebar;
    
        double diagonal = Math.sqrt(Math.pow(lebar, 2) + Math.pow(panjang, 2));
        System.out.println("Luas = " + panjang * lebar);
        System.out.println("Panjang diagonal = " + diagonal);
    }
}
public class OperasiSegiempat {
    public static void main(String[] args) {
        Segiempat segiempat1 = new Segiempat(16, 8);
                
    
}
}
