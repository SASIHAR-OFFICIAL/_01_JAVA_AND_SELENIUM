package _19_J_If_Else_If;

import java.util.Scanner;

public class Divisible_by_3_AND_5 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter number = ");
		int a = scan.nextInt();
		
		if (a%3 == 0 && a%5 == 0) {
			System.out.println("The number is Divisible by 3 and 5");
			
		}
		
		else if (a%3 == 0) {
			System.out.println("The number is Divisible by 3 only");
		}

		else if (a%5 == 0) {
			System.out.println("The number is Divisible by 5 only");
		}
		else {
			System.out.println("Not Divisible by 3 and 5");
		}
	}

}
