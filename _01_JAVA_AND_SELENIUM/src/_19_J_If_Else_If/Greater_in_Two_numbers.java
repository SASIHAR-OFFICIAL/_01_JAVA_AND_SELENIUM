package _19_J_If_Else_If;

import java.util.Scanner;

public class Greater_in_Two_numbers {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter 1 number");
		int a = scan.nextInt();
		System.out.println("Enter 2 number");
		int b = scan.nextInt();
	
if (a>b) {
	System.out.println(" 1 number is Greater");
		
}
else if (b>a) {
	System.out.println(" 2 number is Greater");
	}
else {
	System.out.println(" 1 and 2 are equal");
}
	}

}
