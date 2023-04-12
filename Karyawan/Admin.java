package Karyawan;

public class Admin extends Karyawan implements CetakInfo {
    private String shift;

    public Admin(String nama, int umur, String alamat, String jenisKelamin, int noTelp, String agama, String kategoriKaryawan, String shift) {
        super(nama, umur, alamat, jenisKelamin, noTelp, agama, kategoriKaryawan);
        this.shift = shift;
    }

    public void setShift(String shift) {
        this.shift = shift;
    }

    public String getShift() {
        return this.shift;
    }

    public void teleponPelanggan() {
        System.out.println("Admin sedang menelepon pelanggan");
    }

    public void catatanKeuangan() {
        System.out.println("Admin sedang membuat catatan keuangan");
    }

    public void catatData() {
        System.out.println("Admin sedang mencatat data");
    }

    public void cetak() {
        super.print();
        System.out.println("Shift\t\t: " + getShift());
        System.out.println("Tugas karyawan (sesuai dengan kategori karyawan) : ");
        catatanKeuangan();
        catatData();
    }
}
