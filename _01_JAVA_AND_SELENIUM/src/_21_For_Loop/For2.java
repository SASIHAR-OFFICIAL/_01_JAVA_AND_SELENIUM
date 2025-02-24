package _21_For_Loop;

import java.util.Iterator;
import java.util.Scanner;

public class For2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter number for a= ");
		int a = scan.nextInt();
		System.out.print("Enter number for b= ");
		int b = scan.nextInt();
		
	
		for(int i=a; i<=b; i=i+1) {
			if (i%2 ==0) {
				System.out.println(i);
			}
			
		}
	}
}
