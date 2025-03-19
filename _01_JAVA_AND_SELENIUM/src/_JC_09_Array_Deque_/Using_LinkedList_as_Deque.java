package _JC_09_Array_Deque_;



	import java.util.Deque;
	import java.util.LinkedList;

	public class Using_LinkedList_as_Deque {
	    public static void main(String[] args) {
	        Deque<String> deque = new LinkedList<>();

	        // Adding elements
	        deque.addFirst("Hello");
	        deque.addLast("World");
	        deque.offerFirst("Java");
	        deque.offerLast("Collections");

	        // Printing elements
	        System.out.println("Deque: " + deque);

	        // Removing elements
	        deque.removeFirst();
	        deque.removeLast();
	        System.out.println("Deque after removal: " + deque);
	    }
	}

