package _19_If_Else_If;

import java.util.Scanner;

public class Greater_in_Three_numbers {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("Enter 1 number ");
		int a = scan.nextInt();
		System.out.print("Enter 2 number ");
		int b = scan.nextInt();
		System.out.print("Enter 3 number ");
		int c = scan.nextInt();
	
if (a>b && a>c) {
	System.out.println(" 1 number is Greater");
}
else if (b>c && b>c) {
	System.out.println(" 2 number is Greater");
}
else if (c>a && c>b) {
	System.out.println(" 3 number is Greater");
}

else  {
	System.out.println(" All are Equal");
}

//else if (a>c) {
//	System.out.println(" 1 number is Greater");
//	}
//else if (b>c) {
//	System.out.println(" 2 number is Greater");
//	}
//else if (b>a) {
//	System.out.println(" 2 number is Greater");
//	}
//else if (c>b) {
//	System.out.println(" 3 number is Greater");
//	}
//else if (c>a) {
//	System.out.println(" 3 number is Greater");
//	}
//else {
//	System.out.println(" 1  2 and 3 are equal");
//}
	}

}