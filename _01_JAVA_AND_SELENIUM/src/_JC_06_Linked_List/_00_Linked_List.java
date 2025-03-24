package _JC_06_Linked_List;

import java.util.LinkedList;
import java.util.Queue;

public class _00_Linked_List {

	public static void main(String[] args) {
		Queue<Integer> queue = new LinkedList<>();
        queue.offer(10);
        queue.offer(20);
        queue.offer(30);
        
        System.out.println(queue.poll()); // 10 (FIFO)
        System.out.println(queue.poll()); // 20
    }
}
	}

}
