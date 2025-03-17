package _JC_05_Iterator;

import java.util.ArrayList;

import _00_Java_IT_ST_Bringed_Array_with_loop.forloop;

public class Iterator {

	public static void main(String[] args) {

		ArrayList<Integer> AL1 = new ArrayList();

		for (int i=0; i<=10; i++) {
			AL1.add(i);
		}
		System.out.println(AL1);
	
	for (int i:AL1) 
		System.out.println(i);
		
	}
}
