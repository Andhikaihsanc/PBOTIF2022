

public class Mobil {
    private String noPlat;
    private String merk;
    private String warna;
    private String bahanBakar;
    private int tahunKeluaran;
    private String kategoriMobil;
    private Travel travel;

    public Mobil(String noPlat, String merk, String warna, String bahanBakar, int tahunKeluaran, String kategoriMobil, Travel travel) {
        this.noPlat = noPlat;
        this.merk = merk;
        this.warna = warna;
        this.bahanBakar = bahanBakar;
        this.tahunKeluaran = tahunKeluaran;
        this.kategoriMobil = kategoriMobil;
        this.travel = travel;
    }

    public Mobil(String merkmo, String tipe, String seri, int platmo, String warnamo, int tahun) {
    }

    public void print() {
        System.out.println("Nomor plat\t: " + this.getNoPlat());
        System.out.println("Merk\t\t: " + this.getMerk());
        System.out.println("Warna\t\t: " + this.getWarna());
        System.out.println("Bahan bakar\t: " + this.getBahanBakar());
        System.out.println("Tahun keluaran\t: " + this.getTahunKeluaran());
        System.out.println("Kategori mobil\t: " + this.getKategoriMobil());
        System.out.println("Rute\t\t: " + this.rute());
        System.out.println("Jarak Tempuh\t: " + this.jarakTempuh() + " km");
    }

    public void maju() {
        System.out.println("Mobil bisa bergerak maju");
    }

    public void mundur() {
        System.out.println("Mobil bisa bergerak mundur");
    }

    public void berbelok() {
        System.out.println("Mobil bisa berbelok");
    }

    public void setKategoriMobil(String kategoriMobil) {
        this.kategoriMobil = kategoriMobil;
    }

    public String getKategoriMobil() {
        return this.kategoriMobil;
    }

    public void setNoPlat(String noPlat) {
        this.noPlat = noPlat;
    }

    public String getNoPlat() {
        return this.noPlat;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public String getMerk() {
        return this.merk;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    public String getWarna() {
        return this.warna;
    }

    public void setBahanBakar(String bahanBakar) {
        this.bahanBakar = bahanBakar;
    }

    public String getBahanBakar() {
        return this.bahanBakar;
    }

    public void setTahunKeluaran(int tahunKeluaran) {
        this.tahunKeluaran = tahunKeluaran;
    }

    public int getTahunKeluaran() {
        return this.tahunKeluaran;
    }

    public double jarakTempuh() { 
        switch(travel){
            case Surabaya : return 95.3;
            case Madura : return 196;
            case Banyuwangi : return 314;
            case Situbondo : return 218;
            case Tulungangung : return 101;
            default : return 0;
        }
    }

    public String rute() {
        switch(travel){
            case Surabaya : return "Surabaya - Malang";
            case Madura : return "Madura - Malang";
            case Banyuwangi : return "Banyuwangi - Malang";
            case Situbondo : return "Situbondo - Malang";
            case Tulungangung : return "Tulungangung - Malang";
            default : return "ERROR!";
        }
    }
}
