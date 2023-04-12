package oop;

// membuat template
class Mahasiswa{
    String nama;
    String NIM;
    
    Mahasiswa (String nama, String NIM){
        this.nama = nama;
        this.NIM = NIM;
        
        System.out.println("Nama = " + nama);
        System.out.println("NIM = " + NIM);
    }
}
public class ClassObject {

    public static void main(String[] args) {
       
        
      //instansiansi / membuat objek
    Mahasiswa mahasiswa1 = new Mahasiswa("Dhika", "123");
    Mahasiswa mahasiswa2 = new Mahasiswa("Salwa", "234");
 
    
    
     
        
      
    }
    
}
