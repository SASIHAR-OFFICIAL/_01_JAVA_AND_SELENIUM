package _00_Java_EMC_03_Return;

import java.util.Scanner;

public class Return_FIND {

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
		Return_FIND obj1 = new Return_FIND();
		obj1.evenorodd(number);


	}

}
