package _J_13_Array;

import java.util.Scanner;

public class _18_Array_EMC_Get__String_ArraySize_Print {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		System.out.println("Input_String_Size = ");

		int Input_String_Size = scan.nextInt();

		String[] Input_String = new String[Input_String_Size];

		for (int i = 0; i <=Input_String_Size-1; i=i+1) {
			Input_String[i]=scan.nextLine();

		}
		System.out.println("-----------------");
		// For getting OUTPUT USING FOR LOOP
		for (int J = 0; J<=Input_String_Size-1; J=J+1) {
			System.out.println(Input_String[J]);
		
		}
		
	}

}
