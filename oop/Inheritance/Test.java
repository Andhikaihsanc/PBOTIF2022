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
public class Test {

    static void pajak(Pegawai p) {
        p.Print();
        if (p instanceof Manager){
            Manager m = (Manager)p; //mengenali object
            m.Manage(); //casting
        }
        System.out.println("Terima kasih telah membayar pajak!");
    }

    public static void main(String[] args) {
        Pegawai pegawai1 = new Pegawai("Salwa", 2000.0);
//        pegawai1.setNama("Indri");
//        pegawai1.setGaji(1000.0);
        pegawai1.Print();

        Manager manajer1 = new Manager("Budi", 1200.0, "Gudang");
//        manajer1.setNama("Budi");
//        manajer1.setGaji(2000.0);
        manajer1.print();

        Pegawai sekretaris = new Sekretaris("Sasha", 4000.0, "Front Office");
        sekretaris.Print();

        Manager manajer2 = new Manager("Andhika", 1500.0, "CEO");
//        manajer2.nama = "Dhika";
//        manajer2.setGaji(5000.0);
//        manajer2.setDepartemen("IT");
        manajer2.print();
//        manajer2.getDepartemen();
//        System.out.println("Departemen = " + manajer2.getDepartemen());
        System.out.println("=======================================");
        pajak(pegawai1);
        System.out.println("=======================================");
        pajak(manajer1);
        System.out.println("=======================================");
        pajak(sekretaris);
        System.out.println("=======================================");
        pajak(manajer2);
        System.out.println("=======================================");
    }
}
