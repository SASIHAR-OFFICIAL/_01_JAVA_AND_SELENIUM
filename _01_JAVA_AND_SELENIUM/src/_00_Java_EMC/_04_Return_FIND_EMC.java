package _00_Java_EMC;

import java.util.Scanner;

public class _04_Return_FIND_EMC {

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
		_04_Return_FIND_EMC obj1 = new _04_Return_FIND_EMC();
		obj1.evenorodd(number);


	}

}
