package _00_Java_EMC;

import java.util.Scanner;

public class _10_01_If_else_Divisible_or_not {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner Get_input = new Scanner(System.in);
		int input = Get_input.nextInt();
		if (input%3==0 && input%5==0) {
			System.out.println("Number is Divisible by 3 or 5");
		}

		else if (input%3==0) {
			System.out.println("Number is Divisible by 3");
		} 
		else if(input%5==0) {
			System.out.println("Number is Divisible by 5");
		}
		else {
			System.out.println("Number is not Divisible by 3 or 5");
			
			
		}}}
