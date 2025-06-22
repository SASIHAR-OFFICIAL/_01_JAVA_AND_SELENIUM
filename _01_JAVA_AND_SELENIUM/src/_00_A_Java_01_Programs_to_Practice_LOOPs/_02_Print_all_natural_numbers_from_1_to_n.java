package _00_A_Java_01_Programs_to_Practice_LOOPs;

import java.util.Scanner;

public class _02_Print_all_natural_numbers_from_1_to_n {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input from user
        System.out.print("Enter a number (n): ");
        int n = scanner.nextInt();

        // Print natural numbers from 1 to n
        System.out.println("Natural numbers from 1 to " + n + " are:");
        int i = 1;
        while (i <= n) {
            System.out.print(i + " ");
            i++;
        }
        scanner.close();
    }}