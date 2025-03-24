package _JC_09_Priority_Queue;

import java.util.PriorityQueue;
import java.util.Queue;
public class PriorityQueueExample4 {

	public static void main(String[] args) {
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		pq.offer(30);
		pq.offer(10);
		pq.offer(20);
		System.out.println(pq.poll()); // Output: 10 (Smallest element first)

	}

}
