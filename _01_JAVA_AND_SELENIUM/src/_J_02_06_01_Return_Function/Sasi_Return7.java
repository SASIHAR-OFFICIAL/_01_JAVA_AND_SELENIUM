package _J_02_06_01_Return_Function;

import java.util.Scanner;

public class Sasi_Return7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		System.out.print("Enter English Mark = ");
		int English = scan.nextInt();
		System.out.print("Enter Tamil Mark = ");
		int Tamil = scan.nextInt();
		System.out.print("Enter Maths Mark = ");
		int Maths = scan.nextInt();
		System.out.print("Enter Science Mark = ");
		int Science = scan.nextInt();
		System.out.print("Enter Social Mark = ");
		int Social = scan.nextInt();
		
		Sasi_Return7 Total_Percentage = new Sasi_Return7();
		int Sub_Total =Total_Percentage.Total_of_5_subjects(English, Tamil, Maths, Science, Social);
		Total_Percentage.Percentage(Sub_Total);
	}

	private int Total_of_5_subjects(int English, int Tamil,int Maths,int Science,int Social  ) {
		// TODO Auto-generated method stub
		int Total_of_5_subjects = English+Tamil+Maths+Science+Social ;
		System.out.println("Total_of_5_subjects = "+Total_of_5_subjects);
		return Total_of_5_subjects;
	}
	
	private void Percentage(int sub_Total) {
		int Percentage = sub_Total/5;
		System.out.println("Percentage = "+Percentage+"%");
	}
	

}
