package Kuis1;

public class Rumah extends Property{
    private String luasT;
    private String luasB;
    private String lantai;
    private String kamarT;
    private String kamarM;
    private String harga;

    //Constructor
    public Rumah(String perumahan, String blok, String jalan, String luasT,
    String luasB, String lantai, String kamarT, String kamarM, String harga){
        super(perumahan, blok, jalan, harga);
        this.luasT = luasT;
        this.luasB = luasB;
        this.lantai = lantai;
        this.kamarT = kamarT;
        this.kamarM = kamarM;
        this.harga = harga;
    }

    // Getter Setter
    public String getLuasT() {
        return luasT;
    }
    public void setLuasT(String luasT) {
        this.luasT = luasT;
    }
    public String getLuasB() {
        return luasB;
    }
    public void setLuasB(String luasB) {
        this.luasB = luasB;
    }
    public String getLantai() {
        return lantai;
    }
    public void setLantai(String lantai) {
        this.lantai = lantai;
    }
    public String getKamarT() {
        return kamarT;
    }
    public void setKamarT(String kamarT) {
        this.kamarT = kamarT;
    }
    public String getKamarM() {
        return kamarM;
    }
    public void setKamarM(String kamarM) {
        this.kamarM = kamarM;
    }
    public String getHarga() {
        return harga;
    }
    public void setHarga(String harga) {
        this.harga = harga;
    }

    //Method
    public void printData() {
        System.out.println("========== FILKOM PROPERTY ==========");
        System.out.println("Perumahan\t: " + this.getPerumahan());
        System.out.println("Blok\t\t: " + this.getBlok());
        System.out.println("Jalan\t\t: " + this.getJalan());
        System.out.println("Luas Tanah\t: " + this.getLuasT());
        System.out.println("Luas Bangunan\t: " + this.getLuasB());
        System.out.println("Banyaknya Lantai: " + this.getLantai());
        System.out.println("Kamar Tidur\t: " + this.getKamarT());
        System.out.println("Kamar Mandi\t: " + this.getKamarM());
        System.out.println("Harga \t\t: " + this.getHarga());
    }
}