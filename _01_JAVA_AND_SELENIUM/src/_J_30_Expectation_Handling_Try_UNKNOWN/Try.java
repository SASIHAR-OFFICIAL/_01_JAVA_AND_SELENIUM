package _J_30_Expectation_Handling_Try_UNKNOWN;

import java.util.Scanner;

public class Try {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
	
		try {
			int num = scan.nextInt();
			num =num/0;	
			System.out.println(num);
		}
		catch (IN e) {
			System.out.println(e);
			System.out.println("hi");
				
		}
		finally {

		}}}
