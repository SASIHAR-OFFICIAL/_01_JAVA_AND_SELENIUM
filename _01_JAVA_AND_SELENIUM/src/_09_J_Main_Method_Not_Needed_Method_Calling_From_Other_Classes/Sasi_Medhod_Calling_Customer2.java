package _09_J_Main_Method_Not_Needed_Method_Calling_From_Other_Classes;

public class Sasi_Medhod_Calling_Customer2 {
	public static void main(String[] args) {
		Sasi_Medhod_Calling_Bank2 NewCustomer = new Sasi_Medhod_Calling_Bank2();
		NewCustomer.HelpDesk();
		NewCustomer.CashCounter();
		System.out.println("Bank Timing  = "+NewCustomer.Bank_Timing);
	}

}
