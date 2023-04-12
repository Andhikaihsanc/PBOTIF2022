package oop;

class Lingkaran {

    double phi = Math.PI;
    double jari;

    // constructor
    Lingkaran(int jari) {
        this.jari = jari;

        double hasil = phi * jari * jari;
        System.out.println("Luas Lingkaran = " + hasil);
    }
}

public class LatihanLingkaran {
    public static void main(String[] args) {
        Lingkaran lingkaran1 = new Lingkaran(7);
           
    }
}
