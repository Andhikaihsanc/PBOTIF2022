import java.util.*;

class TestJavaCollection1 {

    public static void main(String args[]) {
        ArrayList<String> list = new ArrayList<String>();//Creating arraylist  
        //Adding object in arraylist  
        list.add("Adi");
        list.add("Putra");
        list.add("Tari");
        list.add("Syila");
        list.remove("Tari");
        list.addFirst();
    //Traversing list through Iterator  
        Iterator itr = list.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}