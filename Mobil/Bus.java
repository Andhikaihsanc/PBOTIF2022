package Mobil;
public class Bus extends Mobil implements CetakInfo {
    private int jumlahKursi;
    private String tv;

    public Bus(String noPlat, String merk, String warna, String bahanBakar, int tahunKeluaran, String kategoriMobil, Travel travel, int jumlahKursi, String tv) {
        super(noPlat, merk, warna, bahanBakar, tahunKeluaran, kategoriMobil, travel);
        this.jumlahKursi = jumlahKursi;
        this.tv = tv;
    }

    public void cetak() {
        super.print();
        System.out.println("Jumlah kursi\t: " + this.getJumlahKursi());
        System.out.println("Tv\t\t: " + this.getTV());
        dropOff();
        pickUp();
        telolet();
    }

    public void dropOff() {
        System.out.println("Bus menurunkan penumpang");
    }

    public void pickUp() {
        System.out.println("Bus mengangkut penumpang");
    }

    public void telolet() {
        System.out.println("Bus membunyikan klakson");
    }

    public void setJumlahKursi(int jumlahKursi) {
        this.jumlahKursi = jumlahKursi;
    }

    public int getJumlahKursi() {
        return this.jumlahKursi;
    }
}