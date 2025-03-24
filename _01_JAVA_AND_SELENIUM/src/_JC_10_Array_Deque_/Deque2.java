package _JC_10_Array_Deque_;

import java.util.ArrayDeque;
import java.util.Deque;

public class Deque2 {

	public static void main(String[] args) {
		Deque<Integer> deque = new ArrayDeque<>();
		deque.addFirst(10);
		deque.addLast(20);
		deque.removeFirst(); // Removes 10
		
		System.out.println(deque);
		

	}

}
