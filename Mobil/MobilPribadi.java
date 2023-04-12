/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Mobil;

public class MobilPribadi extends Mobil implements CetakInfo {

    private int noSTNK;
    private String headUnit;

    public MobilPribadi(String noPlat, String merk, String warna, String bahanBakar, int tahunKeluaran, String kategoriMobil, Travel travel, int noSTNK, String headUnit) {
        super(noPlat, merk, warna, bahanBakar, tahunKeluaran, kategoriMobil, travel);
        this.noSTNK = noSTNK;
        this.headUnit = headUnit;
    }

    public void cetak() {
        super.print();
        System.out.println("Nomor STNK\t: " + this.getNoSTNK());
        System.out.println("Head unit\t: " + this.getHeadUnit());
        bensinFull();
        bensinHabis();
    }

    public void bensinFull() {
        System.out.println("Bensin mobil sudah terisi");
    }

    public void bensinHabis() {
        System.out.println("Bensin mobil sudah habis");
    }

    public void setNoSTNK(int noSTNK) {
        this.noSTNK = noSTNK;
    }

    public int getNoSTNK() {
        return this.noSTNK;
    }

    public void setHeadUnit(String headUnit) {
        this.headUnit = headUnit;
    }

    public String getHeadUnit() {
        return this.headUnit;
    }
}
