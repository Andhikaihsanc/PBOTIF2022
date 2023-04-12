package Karyawan;

public class KaryawanTest {
    static void opsi(Karyawan kategori) {
        if (kategori instanceof SupirTravel) {
            SupirTravel s = (SupirTravel) kategori;
            s.cetak();
        } else if (kategori instanceof SupirRentCar) {
            SupirRentCar r = (SupirRentCar) kategori;
            r.cetak(); 
        } else if (kategori instanceof Admin) {
            Admin a = (Admin) kategori;
            a.cetak();
        }
    }
    
    public static void main(String[] args) {
        System.out.println("=================================");
        System.out.printf("%28s%n" , "FILKOM Tour and Travel");
        System.out.println("=================================");

        Karyawan supirRentCar = new SupirRentCar("Bahi Dzakwan", 19, "Jakarta Selatan", "Laki-laki", 12345678, "Islam", "Supir Rentcar", "15 jam");

        opsi(supirRentCar);
        System.out.println("=================================");

        Karyawan admin = new Admin("Feli Keysa Rahmania", 24, "Malang", " Perempuan", 425531234, "Hindu", "Admin", "Siang hari");

        opsi(admin);
        System.out.println("=================================");

        Karyawan supirTravel = new SupirTravel("Athaya Dafi Fathian", 30, "Serpong", "Laki-laki", 325352352, "Kristen", "Supir Travel", "60 km");

        opsi(supirTravel);
        System.out.println("=================================");

        Karyawan admin2 = new Admin("Peter Parker", 21, "Padang", "Laki-laki", 312313133, "Budha", "Admin", "Malam hari");
        
        opsi(admin2);

        System.out.println("=================================");
        System.out.printf("%26s%n" , "DATA TELAH DISIMPAN");
        System.out.printf("%22s%n" , "TERIMA KASIH");
    }
}