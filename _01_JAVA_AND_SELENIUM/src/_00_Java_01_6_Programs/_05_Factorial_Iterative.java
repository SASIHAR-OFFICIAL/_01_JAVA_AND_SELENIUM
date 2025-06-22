package _00_Java_01_6_Programs;

public class _05_Factorial_Iterative {

	public static void main(String[] args) {
        int num = 10;  // Change this number to calculate factorial of a different value
        long factorial = 1;

        for (int i = 1; i <= num; i++) {
            factorial *= i;
        }

        System.out.println("Factorial of " + num + " is: " + factorial);
    }
}