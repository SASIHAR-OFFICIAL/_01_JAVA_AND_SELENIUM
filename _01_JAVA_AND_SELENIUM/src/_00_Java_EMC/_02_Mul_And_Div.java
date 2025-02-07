package _00_Java_EMC;

import java.util.Scanner;

public class _02_Mul_And_Div {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();

		int d =a*b*c;
		int e = a+b+c;

		int f =d/e;

		System.out.println("Answer ="+f);
	}}
