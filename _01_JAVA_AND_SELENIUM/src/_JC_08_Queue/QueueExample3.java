package _JC_08_Queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample3 {

	public static void main(String[] args) {
		Queue<Integer> queue = new LinkedList<>();
		queue.offer(10);
		queue.offer(5);
		queue.offer(20);
		queue.poll(); // Removes 10
		System.out.println(queue); // Output: [5, 20]
	}

}
