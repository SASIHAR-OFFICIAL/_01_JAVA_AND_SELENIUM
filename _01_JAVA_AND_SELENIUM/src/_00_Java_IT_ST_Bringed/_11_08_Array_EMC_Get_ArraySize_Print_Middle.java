package _00_Java_IT_ST_Bringed;

import java.util.Scanner;

public class _11_08_Array_EMC_Get_ArraySize_Print_Middle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Get input for Array
		Scanner scan = new Scanner(System.in);
		System.out.println("Size =");
		int Size = scan.nextInt();
		
		int[] input_mark = new int[Size];
		
			for (int i = 0; i<=Size-1; i=i+1) {
				input_mark[i] = scan.nextInt();
				
			}
			System.out.println("Middle Number = "+input_mark);
		}
	}


