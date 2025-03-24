package _JC_09_Priority_Queue;
import java.util.*;
import java.util.PriorityQueue;
import java.util.Queue;


public class PriorityQueue_Heap_behavior {

	public static void main(String[] args) {

		 PriorityQueue<Integer> pq = new PriorityQueue<>();
	        pq.offer(30);
	        pq.offer(10);
	        pq.offer(20);

	        System.out.println(pq.poll()); // 10 (smallest element first)
	        System.out.println(pq.poll()); // 20
	    }
	}