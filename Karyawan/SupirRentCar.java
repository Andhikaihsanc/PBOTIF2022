package Karyawan;

public class SupirRentCar extends Karyawan implements CetakInfo {
    private String lamaSewa;

    public SupirRentCar(String nama, int umur, String alamat, String jenisKelamin, int noTelp, String agama, String kategoriKaryawan, String lamaSewa) {
        super(nama, umur, alamat, jenisKelamin, noTelp, agama, kategoriKaryawan);
        this.lamaSewa = lamaSewa;
    }

    public void setLamaSewa(String lamaSewa) {
        this.lamaSewa = lamaSewa;
    }

    public String getLamaSewa() {
        return this.lamaSewa;
    }

    public void kunci() {
        System.out.println("Supir memberikan kunci mobil kepada pelanggan");
    }

    public void cetak() {
        super.print();
        System.out.println("Lama sewa\t: "+ getLamaSewa());
        System.out.println("Tugas karyawan (sesuai dengan kategori karyawan) : ");
        kunci();
    }
}
