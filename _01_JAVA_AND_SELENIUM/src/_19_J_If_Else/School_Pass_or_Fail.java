package _19_J_If_Else;

import java.util.Scanner;

public class School_Pass_or_Fail {

public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the Mark = ");
		int  Input_Mark = scan.nextInt();
		
		if (Input_Mark>=35) {
			System.out.println("The Student is PASSED");
		}else {
			System.out.println("The Student is FAILED");
		}

	}

}
