package _J_03_01_For_Loop;

import java.util.Scanner;

public class _06_For_Loop_EMC_Get_Print {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a = ");
		int a = scan.nextInt();
		System.out.println("Enter b = ");
		int b = scan.nextInt();

		for (int i = a;i<=b;i++ ) {
			System.out.println(i);
		}
	}

}
