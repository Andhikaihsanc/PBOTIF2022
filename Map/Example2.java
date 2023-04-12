package Map;

import java.util.*;

public class Example2 {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<Integer, String>(); //generic structure

        map.put(100, "Tari");
        map.put(101, "Syila");
        map.put(102, "Putra");
        //Elements can traverse in any order  
        for (Map.Entry m : map.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }
    }
}