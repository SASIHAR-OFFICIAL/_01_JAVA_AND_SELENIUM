package _JC_09_Priority_Queue;

import java.util.*;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.PriorityQueue;
import java.util.Queue;


public class PriorityQueue {

	public static void main(String[] args) {
		PriorityQueue<Integer> pq = new PriorityQueue<>();
	
		pq.offer(10);
		pq.offer(5);
		pq.offer(20);
		pq.poll(); // Removes 5 (smallest element)
		System.out.println(pq); // Output: [10, 20]
	}

}
