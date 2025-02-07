package _J_02_03_03_Method_Overloading_POLYMORPHISM_Sasi;

import java.util.Scanner;

public class MOL2 {

	String words(String Words1) {
		return Words1;

	}
	int words(int a, int b) {
		return a+b;

	}
	String words(String Words1, String Words2,String Words3) {
		return Words1+Words2+Words3;

	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String words1 = scan.nextLine();
		
		int a = scan.nextInt();
		int b = scan.nextInt();
		
		String Words2 = scan.nextLine();
		String Words3 = scan.nextLine();
		
		MOL2 MOL_OPbject = new MOL2();
		
		
		System.out.println("Word1 ="+MOL_OPbject.words(words1));
		System.out.println("Word2 ="+MOL_OPbject.words(a,b));
		System.out.println("Word3 ="+MOL_OPbject.words(words1, Words2, Words3));

	}

}

