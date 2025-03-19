package _JC_08_Queue;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Queue1 {

	public static void main(String[] args) {
		Queue Q = new LinkedList();
		
		Q.add(15);
		Q.add(64);
		Q.add(1);
		Q.add("jaga");
		Q.add(15);
		
		System.out.println("---------------Queue--------------------");
		System.out.println(Q);
		

		PriorityQueue PQ = new PriorityQueue();
		
		PQ.add(105);
		PQ.add(15);
		PQ.add(1);
		PQ.add(155);
		PQ.add(15);
		PQ.add(150);
		
		System.out.println("---------------Priority Queue--------------------");
		System.out.println(PQ);
		
	}

}
