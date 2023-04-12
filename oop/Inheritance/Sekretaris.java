/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop.Inheritance;

/**
 *
 * @author Andhika
 */
public class Sekretaris extends Pegawai {

    String divisi;

    public Sekretaris(String nama, double gaji, String departemen) {
        super(nama, gaji);
        this.divisi = divisi;
        System.out.println("Constructor Child");
    }

    public void print() {
        System.out.println("Nama   : " + getNama());
        System.out.println("Gaji   : " + getGaji());
        System.out.println("Divisi : " + divisi);

    }

}
