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
public class Pegawai {

    protected String nama;
    protected double gaji;
    public Pegawai(){}
    public Pegawai(String nama, double gaji) {
        this.nama = nama;
        this.gaji = gaji;
    }

    public void Print() {
        System.out.println("Nama = " + getNama());
        System.out.println("Gaji = " + getGaji());
       
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public double getGaji() {
        return gaji;
    }

    public void setGaji(double gaji) {
        this.gaji = gaji;
    }
    
}
