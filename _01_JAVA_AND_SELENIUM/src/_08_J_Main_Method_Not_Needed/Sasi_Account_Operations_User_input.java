package _08_J_Main_Method_Not_Needed;

import java.util.Scanner;

public class Sasi_Account_Operations_User_input {

	public static void main(String[] args) {

		//		Sasi_Account_Operations_User_input obj = new Sasi_Account_Operations_User_input();
		//		obj.banks();
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter Bank Name = ");
		String Bank_name =scan.nextLine();
		if (Bank_name .equals("TAICO") ) {
			System.out.println("Closed");
					}
		if (Bank_name  .equals("SBI")){
			System.out.println("Personal");
		}
		if (Bank_name.equals("DBS")||Bank_name.equals("LVB")){
			System.out.println("For Dad");
		}
		if (Bank_name.equals("HDFC")){
			System.out.println("Salary");
		}
		if (Bank_name.equals("CUB")){
			System.out.println("FOR JEWEL LOAN");
		}
		if (Bank_name.equals("IPPB")){
			System.out.println("For PAPA");
		}
		if (Bank_name.equals("BANDHAN")){
			System.out.println("For RENT");
		}
	}

}	





