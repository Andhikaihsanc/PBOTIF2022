
package Interface;


public class Program2 {
    public static void main(String[] args) {
        CetakSemua cetak = new CetakSemua();
        System.out.println(cetak.cetakStr1("Halo Bandung"));
        System.out.println(cetak.cetakStr2("Halo Jakarta"));
        System.out.println(cetak.cetakInt1(12));
        System.out.println(cetak.cetakInt2(7));
        cetak.cetak();
        cetak.msg();
    }    
}

