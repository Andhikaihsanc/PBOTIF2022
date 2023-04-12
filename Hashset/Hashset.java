package Hashset;

import java.util.*;
class HashSet1 {
    public static void main(String args[]) {
        //Creating HashSet and adding elements  
        HashSet<String> set = new HashSet();
        set.add("Adi");
        set.add("Putra");
        set.add("Tari");
        set.add("Syila");
        Iterator<String> i = set.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        }
    }
}