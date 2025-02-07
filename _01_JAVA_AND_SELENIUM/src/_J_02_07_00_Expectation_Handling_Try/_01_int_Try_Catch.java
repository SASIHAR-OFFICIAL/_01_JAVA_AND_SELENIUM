package _J_02_07_00_Expectation_Handling_Try;

import java.util.Scanner;

public class _01_int_Try_Catch {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		try {
			int a = scan.nextInt();
			System.out.println("a = "+a);
		} catch (Exception e) {
			System.out.println(e);
		}
		System.out.println("Program Ended");
	}

}
