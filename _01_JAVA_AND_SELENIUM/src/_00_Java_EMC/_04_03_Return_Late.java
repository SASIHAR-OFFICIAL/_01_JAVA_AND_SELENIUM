package _00_Java_EMC;

import java.util.Scanner;

public class _04_03_Return_Late {
	String Timing (int time) {
		if (time >=9) {
			return "permission";
		}
		else {
			return "Normal";
		}	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Moring_Punch_Time = ");
		int Moring_Punch_Time = scan.nextInt();
		
		_04_03_Return_Late object = new _04_03_Return_Late();
		String timing_Enter = object.Timing(Moring_Punch_Time);
		System.out.print(timing_Enter);

	}}
