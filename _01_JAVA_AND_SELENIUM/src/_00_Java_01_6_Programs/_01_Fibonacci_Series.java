package _00_Java_01_6_Programs;

public class _01_Fibonacci_Series {

	public static void main(String[] args) {
		 int count = 10; // Number of terms
	        int first = 0, second = 1;

	        System.out.println("Fibonacci Series up to " + count + " terms:");

	        for (int i = 1; i <= count; i++) {
	            System.out.print(first + " ");

	            // calculate next term
	            int next = first + second;
	            first = second;
	            second = next;
	        }
	    }
	}