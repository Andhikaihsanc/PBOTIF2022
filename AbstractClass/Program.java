/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AbstractClass;

/**
 *
 * @author Andhika
 */
class Program {

    public static void main(String[] args) {
//        BangunDatar bangun = new BangunDatar(4);
        Persegi psg = new Persegi(3);
        PersegiPanjang psgpjg = new PersegiPanjang(5, 7);
        psg.cetak();
        System.out.println("Rumus Persegi\n=====");
        System.out.println("Luas Persegi     : " + psg.luas());
        System.out.println("Keliling Persegi : " + psg.keliling());
        psgpjg.cetak();
        System.out.println("Rumus Persegi Panjang\n=====");
        System.out.println("Luas Persegi Panjang     : " + psgpjg.luas());

        System.out.println("Keliling Persegi Panjang : " + psgpjg.keliling());
    }
}
