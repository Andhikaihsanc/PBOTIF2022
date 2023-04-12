package Sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

class TestSort1{
public static void main(String args[]){
ArrayList<Integer> al=new ArrayList<Integer>();
al.add(90);
// al.add(80);
// al.add(5);
// al.add(27);
// al.add(73);
Collections.sort(al);
Iterator itr=al.iterator();
while(itr.hasNext()){
System.out.println(itr.next());
}
}
}