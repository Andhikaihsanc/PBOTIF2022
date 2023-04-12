import java.util.*;

public class TestJavaCollection2 {

    public static void main(String args[]) {
        LinkedList<String> al = new LinkedList<String>();
        al.add("Adi");//Adding object in arraylist  
        al.add("Putra");
        al.add("Tari");
        al.add("Syila");
        al.addFirst
       
       
        Iterator<String> itr = al.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}