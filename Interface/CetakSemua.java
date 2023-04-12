/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

/**
 *
 * @author Andhika
 */
public class CetakSemua implements Interface3 {

    public String cetakStr1(String x) {
        return "Cetak String 1 : " + x;
    }

    public String cetakStr3(String x, String y) {
        return "Cetak String 1 : " + x;
    }

    public String cetakStr2(String x) {
        return "Cetak String 2 : " + x;
    }

    public String cetakInt1(int x) {
        return "Cetak Integer 1 : " + x;
    }

    public String cetakInt2(int x) {
        return "Cetak Integer 2 : " + x;
    }

    public void cetak() {

        System.out.println("Semua sudah tercetak");
    }
}
