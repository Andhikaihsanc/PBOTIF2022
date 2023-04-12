package Map;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

class LinkedHashMap1 {
    public static void main(String args[]) {
        LinkedHashMap<Integer, String> hm = new LinkedHashMap<Integer, String>();
        hm.put(1, "Tari");
        hm.put(2, "Syila");
        hm.put(5, "Putra");
        hm.put(8, "Andhika");
        hm.remove(6);
        for (Entry<Integer, String> m : hm.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }
    }
}
