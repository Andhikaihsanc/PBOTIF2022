import java.util.Iterator;
import java.util.Vector;

public class TestJavaCollection3 {
    public static void main(String args[]) {
        Vector<String> v = new Vector<String>();
        v.add("Adi");//Adding object in vector 
        v.add("Putra");
        v.add("Tari");
        v.add("Syila");
        
        Iterator<String> itr = v.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}