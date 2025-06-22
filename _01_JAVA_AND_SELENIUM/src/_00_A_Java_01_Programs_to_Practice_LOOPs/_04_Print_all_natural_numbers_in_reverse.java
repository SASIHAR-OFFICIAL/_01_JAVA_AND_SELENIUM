package _00_A_Java_01_Programs_to_Practice_LOOPs;

import java.util.Scanner;

public class _04_Print_all_natural_numbers_in_reverse {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a positive number: ");
        int n = scanner.nextInt();

        for (int i = n; i >= 1; i--) {
            System.out.print(i + " ");
        }

        scanner.close();
    }
}