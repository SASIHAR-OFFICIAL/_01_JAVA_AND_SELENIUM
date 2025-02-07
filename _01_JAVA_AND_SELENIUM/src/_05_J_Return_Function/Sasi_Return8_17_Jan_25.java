package _05_J_Return_Function;

import java.util.Scanner;

public class Sasi_Return8_17_Jan_25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sasi_Return8_17_Jan_25 obj = new Sasi_Return8_17_Jan_25();
		int Dad_Amount =obj.Dad_Given();
		int Mom_Amount =obj.Mom_Given();
		int Total =Dad_Amount+Mom_Amount;
		System.out.println("Total = "+Total);
		
	}

	private int Dad_Given() {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("Dad Given = ");
		int Dad_Given_amount = scan.nextInt();
		return Dad_Given_amount;
	}
	private int Mom_Given() {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("Mom Given = ");
		int Mom_Given_amount = scan.nextInt();
		return Mom_Given_amount;
	}
}
