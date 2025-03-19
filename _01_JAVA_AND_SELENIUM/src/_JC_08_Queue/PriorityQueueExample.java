package _JC_08_Queue;

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
        

        System.out.println("PriorityQueue: " + pq);
        
        while (!pq.isEmpty()) {
            System.out.println("Removed: " + pq.poll());
        }
    }
}