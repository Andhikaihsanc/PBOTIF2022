package Karyawan;

public class SupirTravel extends Karyawan implements CetakInfo {
    private String jarakTempuh;

    public SupirTravel(String nama, int umur, String alamat, String jenisKelamin, int noTelp, String agama, String kategoriKaryawan, String jarakTempuh) {
        super(nama, umur, alamat, jenisKelamin, noTelp, agama, kategoriKaryawan);
        this.jarakTempuh = jarakTempuh;
    }

    public void setJarakTempuh(String jarakTempuh) {
        this.jarakTempuh = jarakTempuh;
    }

    public String getJarakTempuh() {
        return this.jarakTempuh;
    }
    
    public void menginjakGas() {
        System.out.println("Supir menginjak pedal gas");
    }

    public void mengerem() {
        System.out.println("Supir menginjak pedal rem");
    }

    public void cetak() {
        super.print();
        System.out.println("Jarak tempuh\t: " + getJarakTempuh());
        System.out.println("Tugas karyawan (sesuai dengan kategori karyawan) : ");
        menginjakGas();
        mengerem();
    }
}
