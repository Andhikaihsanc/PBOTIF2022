
import java.util.*;

class MapExample3 {

    public static void main(String args[]) {
        Map<Integer, String> map = new HashMap<Integer, String>();
        map.put(100, "Tari");
        map.put(101, "Syila");
        map.put(102, "Putra");
        map.put(99, "Dhika");
        //Returns a Set view of the mappings contained in this map        
        map.entrySet()
                //Returns a sequential Stream with this collection as its source  
                .stream()
                //Sorted according to the provid
                .sorted(Map.Entry.comparingByValue())
                //Performs an action for each element of this stream  
                .forEach(System.out::println);
    }
}