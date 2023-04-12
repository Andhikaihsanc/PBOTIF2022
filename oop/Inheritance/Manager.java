/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop.Inheritance;

public class Manager extends Pegawai {

    private String departemen;

    public Manager(String nama, double gaji, String departemen) {
        super(nama, gaji);
        this.departemen = departemen;
    }
    public void Manage(){
        System.out.println("manage pekerjaan");
    }

    public String getDepartemen() {
        return departemen;
    }

    public void setDepartemen(String departemen) {
        this.departemen = departemen;
    }

    public void print() {
        super.Print();
        System.out.println("Departemen = " + getDepartemen());
    }
}
