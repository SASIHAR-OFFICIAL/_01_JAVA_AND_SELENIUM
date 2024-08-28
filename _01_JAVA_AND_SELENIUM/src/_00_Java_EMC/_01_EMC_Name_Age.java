package _00_Java_EMC;

import java.util.Scanner;

public class _01_EMC_Name_Age {

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
