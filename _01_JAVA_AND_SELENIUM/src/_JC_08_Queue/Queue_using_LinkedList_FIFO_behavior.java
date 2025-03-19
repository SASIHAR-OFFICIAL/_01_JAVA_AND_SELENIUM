package _JC_08_Queue;



	import java.util.*;

	public class Queue_using_LinkedList_FIFO_behavior {
	    public static void main(String[] args) {
	        Queue<Integer> queue = new LinkedList<>();
	        queue.offer(10);
	        queue.offer(20);
	        queue.offer(30);
	        
	        System.out.println(queue.poll()); // 10 (FIFO)
	        System.out.println(queue.poll()); // 20
	        System.out.println(queue.poll()); 
	        System.out.println(queue.poll()); // Shows null because of iterator cannot find fourth object
	    }
	}