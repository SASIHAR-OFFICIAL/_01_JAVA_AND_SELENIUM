package _19_J_Nested_If;

import java.util.Scanner;

public class Nested_If_Sasi {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int input1 = scan.nextInt();
		if (input1 <=1) {
			System.out.println("Type 2");
			int input2 = scan.nextInt();
			if (input2<=2) {
				System.out.println("Type 3");
				int input3 = scan.nextInt();
				if (input3 <=3) {
					System.out.println("Type 4");
				}

			}
		}
	}

}
