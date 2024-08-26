package _J_02_02_Add_Sub_Mul_Div_Return_Addition;

import java.util.Scanner;

public class _03_01_EMC_Name_Age {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		String Name = scan.nextLine();
		int Age = scan.nextInt();
		scan.nextLine(); // TO BREAK A INTEGER INPUT BECAUSE AFTER INTEGER INPUT THE STRING WILL NOT ACCEPTED
		String Address = scan.nextLine();
		System.out.println("Name = "+Name);
		System.out.println("Age = "+Age);
		System.out.println("Address = "+Address);
	}}
