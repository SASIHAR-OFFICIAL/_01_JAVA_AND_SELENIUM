package _J_07_If_Else;

import java.util.Scanner;

public class _12_If_else_EMC_Traffic_Light {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner Scan = new Scanner(System.in);
		String Given_Word = Scan.nextLine();

		if (Given_Word .equals("red")  ) {
			System.out.println("STOP");		
		}
		if (Given_Word.equals("yellow") ) {
			System.out.println("GET READY");		
		}	
		if (Given_Word.equals("green" )) {
			System.out.println("GO");		
		}	


	}}
