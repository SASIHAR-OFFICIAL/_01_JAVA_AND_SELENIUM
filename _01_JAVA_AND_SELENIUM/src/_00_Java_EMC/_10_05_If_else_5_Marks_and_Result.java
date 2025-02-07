package _00_Java_EMC;

import java.util.Scanner;

public class _10_05_If_else_5_Marks_and_Result {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Get_Mark = new Scanner(System.in);
		int M1 = Get_Mark.nextInt();
		int M2 = Get_Mark.nextInt();
		int M3 = Get_Mark.nextInt();
		int M4 = Get_Mark.nextInt();
		int M5 = Get_Mark.nextInt();
		
		int All_Mark =M1+M2+M3+M4+M5;
		
		int Per = All_Mark/5;
		System.out.println("Percentage = "+Per);
		
		if (Per<35) {
			System.out.println("Additional class is required");
		}
		else {
			System.out.println("Your are good to go");
		}
		}}
