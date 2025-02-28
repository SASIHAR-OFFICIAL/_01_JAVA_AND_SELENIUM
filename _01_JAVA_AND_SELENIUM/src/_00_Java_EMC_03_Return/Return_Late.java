package _00_Java_EMC_03_Return;

import java.util.Scanner;

public class Return_Late {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("Moring_Punch_Time = ");
		int Moring_Punch_Time = scan.nextInt();
		
		Return_Late object = new Return_Late();
		String timing_Enter = object.Timing(Moring_Punch_Time);
		System.out.print(timing_Enter);
	}
	String Timing (int time) {
		if (time >=9) {
			return "permission";
		}
		else {
			return "Normal";
		}	}
	}
