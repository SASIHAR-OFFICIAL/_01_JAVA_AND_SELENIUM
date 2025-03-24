package _JC_10_Array_Deque_;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class DeQueue {

	public static void main(String[] args) {
		Deque<Integer> deque = new ArrayDeque<>();
		deque.offerFirst(10);
		deque.offerLast(5);
		deque.offerFirst(20);
		deque.pollFirst(); // Removes 20 (front)
		System.out.println(deque); // Output: [10, 5]
		
		
		

	}

}
