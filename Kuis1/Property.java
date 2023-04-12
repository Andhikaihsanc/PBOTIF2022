package Kuis1;
import java.util.Scanner;
public class Property {
    private Scanner in = new Scanner(System.in);
    private String perumahan;
    private String blok;
    private String jalan;
    private String harga;

    //Constructor
    public Property(){

    }
    
    public Property(String perumahan, String blok, String jalan, String harga){
        this.perumahan = perumahan;
        this.blok = blok;
        this.jalan = jalan;
        this.harga = harga;
    }
    
    //Getter Setter
    public Scanner getIn() {
        return in;
    }

    public void setIn(Scanner in) {
        this.in = in;
    }

    public String getPerumahan() {
        return perumahan;
    }

    public void setPerumahan(String perumahan) {
        this.perumahan = in.nextLine();
    }

    public String getBlok() {
        return blok;
    }

    public void setBlok(String blok) {
        this.blok = in.nextLine();
    }

    public String getJalan() {
        return jalan;
    }

    public void setJalan(String jalan) {
        this.jalan = in.nextLine();
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
    }
    void bayarPajak(){
        System.out.println("Pajak Properti\t: " + this.getHarga() + " + 10%");
    }
}
