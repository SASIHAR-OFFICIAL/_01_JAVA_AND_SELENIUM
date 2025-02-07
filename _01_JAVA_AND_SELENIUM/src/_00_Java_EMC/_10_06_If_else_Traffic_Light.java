package _00_Java_EMC;

import java.util.Scanner;

public class _10_06_If_else_Traffic_Light {

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
