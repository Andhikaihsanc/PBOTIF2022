package Kuis1;

public class Ruko extends Property{
    private String luast;
    private String luasb;
    private String lantai;
    private String kamarm;
    private String ruangd;
    private String ruangp;
    private String harga;

    // Constructor
    public Ruko(String perumahan, String blok, String jalan, String luast,
    String luasb, String lantai, String kamarm, String ruangd, String ruangp,
    String harga){
        super(perumahan, blok, jalan, harga);
        this.luast = luast;
        this.luasb = luasb;
        this.lantai = lantai;
        this.kamarm = kamarm;
        this.ruangd = ruangd;
        this.ruangp = ruangp;
        this.harga = harga;
    }

    //Getter Setter
    public String getLuast() {
        return luast;
    }
    public void setLuast(String luast) {
        this.luast = luast;
    }
    public String getLuasb() {
        return luasb;
    }
    public void setLuasb(String luasb) {
        this.luasb = luasb;
    }
    public String getLantai() {
        return lantai;
    }
    public void setLantai(String lantai) {
        this.lantai = lantai;
    }
    public String getKamarm() {
        return kamarm;
    }
    public void setKamarm(String kamarm) {
        this.kamarm = kamarm;
    }
    public String getRuangd() {
        return ruangd;
    }
    public void setRuangd(String ruangd) {
        this.ruangd = ruangd;
    }
    public String getRuangp() {
        return ruangp;
    }
    public void setRuangp(String ruangp) {
        this.ruangp = ruangp;
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
        System.out.println("Luas Tanah\t: " + this.getLuast());
        System.out.println("Luas Bangunan\t: " + this.getLuasb());
        System.out.println("Banyaknya Lantai: " + this.getLantai());
        System.out.println("Kamar Mandi\t: " + this.getKamarm());
        System.out.println("Ruang Display\t: " + this.getRuangd());
        System.out.println("Parkiran\t: " + this.getRuangp());
        System.out.println("Harga \t\t: " + this.getHarga());
    }
}
