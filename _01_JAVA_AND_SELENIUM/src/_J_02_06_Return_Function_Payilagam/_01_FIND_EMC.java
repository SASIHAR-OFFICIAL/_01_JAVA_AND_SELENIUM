package _J_02_06_Return_Function_Payilagam;

import java.util.Scanner;

public class _01_FIND_EMC {

	void evenorodd(int num) {
		if (num%2 ==0) {
			System.out.println(num+" = This is EVEN number");
		}
		else {
			System.out.println(num+" = This is ODD number");
		}


	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Number = ");
		int number = scan.nextInt();
		_01_FIND_EMC obj1 = new _01_FIND_EMC();
		obj1.evenorodd(number);


	}

}
