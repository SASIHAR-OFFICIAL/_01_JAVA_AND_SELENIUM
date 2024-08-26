package _J_02_06_Return_Function_Payilagam;

import java.util.Scanner;

public class _03_Late_EMC {
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
		
		_03_Late_EMC object = new _03_Late_EMC();
		String timing_Enter = object.Timing(Moring_Punch_Time);
		System.out.print(timing_Enter);

	}}
