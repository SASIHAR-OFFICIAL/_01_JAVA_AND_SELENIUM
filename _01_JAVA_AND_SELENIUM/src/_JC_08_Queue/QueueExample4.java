package _JC_08_Queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample4 {

	public static void main(String[] args) {
		Queue<Integer> queue = new LinkedList<>();
		queue.offer(10);
		queue.offer(20);
		System.out.println(queue.poll()); // Output: 10 (First added element)

	}

}
