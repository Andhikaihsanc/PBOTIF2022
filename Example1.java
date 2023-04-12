import java.util.*;

public class Example1 {

    public static void main(String[] args) {
        Map map = new HashMap(); // tanpa generic
        //Adding elements to map  
        map.put(1, "Adi");
        map.put(5, "Putra");
        map.put(2, "Tari");
        map.put(6, "Syila");
        map.put(4, "Dhika");
        // map.remove(1);
        map.remove(3);
        map.replace(1, "Ajeng");
        map.replace(5, "Putra", "putri");
        // map.clear();
        //Traversing Map  
        Set set = map.entrySet();//Converting to Set so that we can traverse  
        Iterator itr = set.iterator();
        while (itr.hasNext()) {
            //Converting to Map.Entry so that we can get key and value
            Map.Entry entry = (Map.Entry) itr.next();
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
