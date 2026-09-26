package _03_02_J_Method;

import java.util.Scanner;

public class Calc_With_user_input {

	public static void main(String[] args) {
		
		Scanner user_input = new Scanner(System.in);
		System.out.println("Giver user input = ");
		
		int a =user_input.nextInt();
		
		int b =10;
		int c= 0;
		
		System.out.println("C ="+(b+a));
		

	}

}

