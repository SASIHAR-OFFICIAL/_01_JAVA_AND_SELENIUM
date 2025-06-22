package _00_Java_01_6_Programs;

public class _06_Factorial_Recursive {
	public static void main(String[] args) {
        int num = 5;
        long result = factorial(num);
        System.out.println("Factorial of " + num + " is: " + result);
    }

    public static long factorial(int n) {
        if (n == 0 || n == 1)
            return 1;
        else
            return n * factorial(n - 1);
    }
}