package _19_J_If_Else;

import java.util.Scanner;

public class FIND_Even_or_Odd {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number = ");
		int number = scan.nextInt();
		
		if (number%2 ==0) {
			System.out.println("The given number " +number+ "  is EVEN number");
			
		}
		else {
			System.out.println("The given number " +number+ "  is ODD number");
	}

}}
