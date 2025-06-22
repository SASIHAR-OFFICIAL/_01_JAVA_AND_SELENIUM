package _00_Java_01_6_Programs;

public class _09_Reverse_a_Number {
	 public static int reverse(int number) {
	        int reversed = 0;
	        while (number != 0) {
	            reversed = reversed * 10 + number % 10;
	            number /= 10;
	        }
	        return reversed;
	    }

	    public static void main(String[] args) {
	        int num = 7890;
	        System.out.println("Original: " + num);
	        System.out.println("Reversed: " + reverse(num));
	    }
	}