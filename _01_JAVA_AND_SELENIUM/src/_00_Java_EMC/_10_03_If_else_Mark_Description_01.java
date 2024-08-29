package _00_Java_EMC;

import java.util.Scanner;

public class _10_03_If_else_Mark_Description_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner Get_Mark = new Scanner(System.in);
		int Mark = Get_Mark.nextInt();
		
		if (Mark<=50) {
			System.out.println("You Need yo improve");		
		}
		else if (Mark<=50 || Mark<=70) {
			System.out.println("Good Job");	
		}
		else if (Mark>=70) {
			System.out.println("Excellent Job");	
		}}}
