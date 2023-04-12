package BinerSearch;

import java.util.*;  
public class CollectionsBinarySearchExample1 {  
    public static void main(String[] args) {  
        //Create list         
          ArrayList<String> arrlist = new ArrayList<String>();  
          arrlist.add("A");  
          arrlist.add("B");  
          arrlist.add("C");  
          arrlist.add("D");  
          //Search the list for key 'D'  
          int index = Collections.binarySearch(arrlist, "D");       
          System.out.println("index D is available at position: "+index);  
        }  
}  
