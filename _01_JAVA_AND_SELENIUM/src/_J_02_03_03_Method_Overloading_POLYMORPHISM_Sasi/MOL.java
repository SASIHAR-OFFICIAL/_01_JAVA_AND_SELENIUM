package _J_02_03_03_Method_Overloading_POLYMORPHISM_Sasi;

import java.util.Scanner;

public class MOL {

	String words(String Words1) {
		return Words1;

	}
	String words(String Words1, String Words2) {
		return Words1+Words2;

	}
	String words(String Words1, String Words2,String Words3) {
		return Words1+Words2+Words3;

	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String words1 = scan.nextLine();
		String words2 = scan.nextLine();
		String words3 = scan.nextLine();
		
		MOL MOL_OPbject = new MOL();
		
		
		System.out.println("Word1 ="+MOL_OPbject.words(words1));
		System.out.println("Word2 ="+MOL_OPbject.words(words1, words2));
		System.out.println("Word3 ="+MOL_OPbject.words(words1, words2, words3));

	}

}

