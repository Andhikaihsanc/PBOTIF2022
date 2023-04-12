package Mobil;

import java.util.Scanner;

public class TestMobil {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Loop : ");
        int n = scan.nextInt();
        scan.nextLine();
        for (int i = 0; i < n; i++) {
            System.out.print("Merk : ");
            String merkmo = scan.nextLine();
            System.out.print("Tipe : ");
            String tipe = scan.nextLine();
            System.out.print("Seri : ");
            String seri = scan.nextLine();
            System.out.print("No Plat : ");
            int platmo = scan.nextInt();
            scan.nextLine();
            System.out.print("Warna : ");
            String warnamo = scan.nextLine();
            System.out.print("Tahun produksi : ");   
            int tahun = scan.nextInt();

            Mobil mobil = new Mobil(merkmo, tipe, seri, platmo, warnamo, tahun);
            System.out.println("------------------------------------------");
            System.out.println("Merk    : " + mobil.getMerkmo());
            System.out.println("Tipe    : " + mobil.getTipe());
            System.out.println("Seri   : " + mobil.getSeri());
            System.out.println("No Plat : " + mobil.getPlatmo());
            System.out.println("Warna   : " + mobil.getWarnamo());
            System.out.println("Tahun   : " + mobil.getTahunMo());

            mobil.drive();
            mobil.speedUp();
            mobil.horn();
            System.out.println("------------------------------------------");
        }
    }
}
