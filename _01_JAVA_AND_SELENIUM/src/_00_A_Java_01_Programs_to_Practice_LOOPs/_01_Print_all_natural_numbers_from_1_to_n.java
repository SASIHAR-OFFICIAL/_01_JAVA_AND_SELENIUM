package _00_A_Java_01_Programs_to_Practice_LOOPs;

import java.util.Scanner;

public class _01_Print_all_natural_numbers_from_1_to_n {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input from user
        System.out.print("Enter a number (n): ");
        int n = scanner.nextInt();

        // Print natural numbers from 1 to n
        System.out.println("Natural numbers from 1 to " + n + " are:");
        for (int i = 1; i <= n; i++) {
            System.out.print(i + " ");
        }
        scanner.close();
    }}