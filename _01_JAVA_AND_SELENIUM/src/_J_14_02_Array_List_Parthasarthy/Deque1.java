package _J_14_02_Array_List_Parthasarthy;

import java.util.ArrayDeque;
import java.util.Deque;
//import java.util.ArrayList;
import java.util.Iterator;

public class Deque1 {

	public static void main(String[] args) {
		Deque <String> d = new ArrayDeque<String>();
		d.add("abc");
		d.add("bcd");
		d.add("def");
		d.add("hg");
		d.add("ikj");
		
		Iterator itr = d.iterator();
//		
//		 System.out.println("After pollLast() Traversal...");  
//		    for(String s:d){  
//		        System.out.println(s);  
		        
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
	}

}
