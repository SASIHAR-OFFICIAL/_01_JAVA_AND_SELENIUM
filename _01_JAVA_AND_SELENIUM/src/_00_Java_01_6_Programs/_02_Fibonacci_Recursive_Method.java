package _00_Java_01_6_Programs;

public class _02_Fibonacci_Recursive_Method {

	 public static int fibonacci(int n) {
	        if (n <= 1)
	            return n;
	        return fibonacci(n - 1) + fibonacci(n - 2);
	    }

	    public static void main(String[] args) {
	        int count = 20;

	        System.out.println("Fibonacci Series using Recursion:");
	        for (int i = 0; i < count; i++) {
	            System.out.print(fibonacci(i) + " ");
	        }
	    }
	}