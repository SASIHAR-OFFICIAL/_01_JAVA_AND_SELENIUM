package _17_J_Array;

import java.util.Iterator;
import java.util.Scanner;

public class Get_int_Input_Using_Array_and_For_Loop {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int[] input  = new int[5];


		for (int i =0;i<=4;i=i+1) {
			input[i] = scan.nextInt();
		}
		
		
		for (int i =0;i<=4;i=i+1) {
			System.out.println(input[i]);
		}
	}}
