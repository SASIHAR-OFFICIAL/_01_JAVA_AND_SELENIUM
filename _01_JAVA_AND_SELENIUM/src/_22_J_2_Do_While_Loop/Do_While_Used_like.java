package _22_J_2_Do_While_Loop;

import java.util.Scanner;

public class Do_While_Used_like {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int count = 0;
		do {
			System.out.println("Enter the number greater than 10 =");
			count= scan.nextInt();
		}
		while(count<=10);
		System.out.println("----------Entered number is  greater than 10----------------- ");
	}
	
}
