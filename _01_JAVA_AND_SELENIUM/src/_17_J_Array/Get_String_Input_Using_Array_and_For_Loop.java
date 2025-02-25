package _17_J_Array;

import java.util.Scanner;

public class Get_String_Input_Using_Array_and_For_Loop {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[] words = new String[5];
		
		for(int i=0;i<=4;i=i+1) {
			words[i]=scan.nextLine();
	}
		for(int i=0;i<=4;i=i+1) {
			System.out.println(words[i]);
	}
}
}