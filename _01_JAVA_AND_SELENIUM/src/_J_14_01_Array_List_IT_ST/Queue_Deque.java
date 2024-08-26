package _J_14_01_Array_List_IT_ST;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

public class Queue_Deque {

	public static void main(String[] args) {
		Deque <String> d = new ArrayDeque<String>();
		//Queue_Deque  d = new Queue_Deque();
		d.add("abc0");
		d.add("bcd");
		d.add("def");
		d.add("hg0");
		d.add("ikj");
		
		
		Iterator itr = d.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
	}

	

}
