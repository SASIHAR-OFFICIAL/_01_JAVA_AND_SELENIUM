package _JC_09_Priority_Queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueExample {
    public static void main(String[] args) {
        Queue<Integer> pq = new PriorityQueue<>();

        pq.offer(30);
        pq.offer(10);
        pq.offer(20);
        pq.offer(30);
        pq.offer(150);
        

        System.out.println("PriorityQueueExample0: " + pq);
        
        while (!pq.isEmpty()) {
            System.out.println("Removed: " + pq.poll());
        }
    }
}