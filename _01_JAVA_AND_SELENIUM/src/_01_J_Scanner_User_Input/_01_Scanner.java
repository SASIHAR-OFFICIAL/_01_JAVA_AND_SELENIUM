package _01_J_Scanner_User_Input;

import java.util.Scanner;

public class _01_Scanner {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String Alphabet = scan.nextLine();
		int Number = scan.nextInt();
		scan.nextLine(); // TO BREAK A INTEGER INPUT BECAUSE AFTER INTEGER INPUT THE STRING WILL NOT ACCEPTED
		String Alphabet_2 = scan.nextLine();
		System.out.println("Alphabet = "+Alphabet);
		System.out.println("Age = "+Number);
		System.out.println("Address = "+Alphabet_2);
	}

}
