package _JC_07_Queue;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class BlockingQueueExample {
    public static void main(String[] args) throws InterruptedException {
        BlockingQueue<Integer> bq = new ArrayBlockingQueue<>(3);
        
        bq.put(1);
        bq.put(2);
        bq.put(3);
        
        System.out.println("BlockingQueue: " + bq);
        
        System.out.println("Removed: " + bq.take());
        System.out.println("BlockingQueue after removal: " + bq);
    }
}