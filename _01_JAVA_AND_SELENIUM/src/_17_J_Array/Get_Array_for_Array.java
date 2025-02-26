package _17_J_Array;

import java.util.Scanner;

public class Get_Array_for_Array {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int Array_Lenght = scan.nextInt();
		int[] array_in_put = new int[Array_Lenght];

		for(int i=0;i<=Array_Lenght-1;i=i+1) {

			array_in_put[i]=scan.nextInt();
		}
		for(int i=0;i<=Array_Lenght-1;i=i+1) {
			System.out.println(array_in_put[i]);
		}

	}
}