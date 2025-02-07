package _J_12_String_Manipulation;

import java.util.Iterator;
import java.util.LinkedList;

public class _08_Queue_linkedlist_IT_ST {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		LinkedList<String> al=new LinkedList<String>();  
		al.add("Ravi");  
		al.add("Vijay");  
		al.add("Ravi");  
		al.add("Ajay");  
		Iterator<String> itr=al.iterator();  
		while(itr.hasNext()){  
		System.out.println(itr.next());  
		}  
		}  
		 

	}
