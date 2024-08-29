package _00_Java_EMC;

import java.util.Scanner;

public class _10_02_If_else_Even_or_Odd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner Get_input = new Scanner(System.in);
		int input = Get_input.nextInt();
		if (input%2 == 0) {
			System.out.println("Given Number is EVEN Number");
			}
		else {
			System.out.println("Given Number is ODD Number");
		}
		}

}
