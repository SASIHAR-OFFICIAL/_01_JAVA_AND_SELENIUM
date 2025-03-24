package _JC_10_Array_Deque_;



	import java.util.Deque;
	import java.util.ArrayDeque;

	public class Using_ArrayDeque {
	    public static void main(String[] args) {
	        Deque<Integer> deque = new ArrayDeque<>();

	        // Adding elements
	        deque.addFirst(10);
	        deque.addLast(20);
	        deque.offerFirst(5);
	        deque.offerLast(25);

	        // Printing elements
	        System.out.println("Deque: " + deque);

	        // Removing elements
	        System.out.println("Removed First: " + deque.pollFirst());
	        System.out.println("Removed Last: " + deque.pollLast());

	        // Retrieving elements
	        System.out.println("First Element: " + deque.peekFirst());
	        System.out.println("Last Element: " + deque.peekLast());
	    }
	}