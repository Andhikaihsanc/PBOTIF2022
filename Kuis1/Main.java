package Kuis1;

public class Main {
    public static void main(String[] args) {
        Rumah dhika = new Rumah("Linux", 
        "5","2 Core","6x10m","36m2","1", "Ada 2", "Ada 1", "Rp. 450.000.000");
        dhika.printData();
        dhika.bayarPajak();

        Ruko acong = new Ruko(
            "Ubuntu", "3", "4 Core", "4x10m", "60m2", "2", "Ada 1", "Ada", "Ada", "Rp.600.000.000");
            acong.printData();
            acong.bayarPajak();
        
    }
}
