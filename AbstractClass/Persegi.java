/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AbstractClass;

 class Persegi extends BangunDatar {

    public double sisi;

    public Persegi(double sisi) {
        this.sisi = sisi;
    }

    public double luas() {
        return sisi * sisi;
    }

    public double keliling() {
        return sisi * 4;
    }
}


