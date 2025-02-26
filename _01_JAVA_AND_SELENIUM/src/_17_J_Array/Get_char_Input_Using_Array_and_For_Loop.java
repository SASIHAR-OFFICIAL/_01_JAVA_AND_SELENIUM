package _17_J_Array;

import java.util.Scanner;

public class Get_char_Input_Using_Array_and_For_Loop {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		char[] c = new char[4];
		
		for(int i=0;i<=3;i=i+1) {
			c[i]= scan.next().charAt(0);
				}
		for(int i=0;i<=3;i=i+1) {
			System.out.println("C array = "+c[i]);
				}
	}

}
