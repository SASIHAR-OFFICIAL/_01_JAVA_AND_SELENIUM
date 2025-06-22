package _00_Java_01_6_Programs;

public class _08_Reverse_a_Number {
	public static void main(String[] args) {
        int number = 12345;
        int reversed = 0;

        while (number != 0) {
            int digit = number % 10;        // Get last digit
            reversed = reversed * 10 + digit; // Add digit to reversed
            number /= 10;                   // Remove last digit
        }

        System.out.println("Reversed number: " + reversed);
    }
}