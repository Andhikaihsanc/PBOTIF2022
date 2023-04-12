package Karyawan;

public class Karyawan {
    private String nama;
    private int umur;
    private String alamat;
    private String jenisKelamin;
    private int noTelp;
    private String agama;
    private String kategoriKaryawan;

    public Karyawan(String nama, int umur, String alamat, String jenisKelamin, int noTelp, String agama, String kategoriKaryawan) {
        this.nama = nama;
        this.umur = umur;
        this.alamat = alamat;
        this.jenisKelamin = jenisKelamin;
        this.noTelp = noTelp;
        this.agama = agama;
        this.kategoriKaryawan = kategoriKaryawan;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return this.nama;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }

    public int getUmur() {
        return this.umur;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getAlamat() {
        return this.alamat;
    }

    public void setJenisKelamin(String jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }

    public String getJenisKelamin(){
        return this.jenisKelamin;
    }

    public void setNoTelp(int noTelp) {
        this.noTelp = noTelp;
    }

    public int getNoTelp() {
        return this.noTelp;
    }

    public void setAgama(String agama) {
        this.agama = agama;
    }

    public String getAgama() {
        return this.agama;
    }

    public void setKategoriKaryawan(String kategoriKaryawan) {
        this.kategoriKaryawan = kategoriKaryawan;
    }

    public String getKategoriKaryawan() {
        return this.kategoriKaryawan;
    }

    public void print() {
        System.out.println("Nama lengkap\t: " + this.getNama());
        System.out.println("Umur\t\t: " + this.getUmur());
        System.out.println("Alamat\t\t: " + this.getAlamat());
        System.out.println("Jenis kelamin\t: " + this.getJenisKelamin());
        System.out.println("Nomor telepon\t: " + this.getNoTelp());
        System.out.println("Agama\t\t: " + this.getAgama());
        System.out.println("Kategori\t: " + this.getKategoriKaryawan());
    }
}
