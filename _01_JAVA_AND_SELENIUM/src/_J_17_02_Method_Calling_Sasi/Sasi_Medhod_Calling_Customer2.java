package _J_17_02_Method_Calling_Sasi;

public class Sasi_Medhod_Calling_Customer2 {
	public static void main(String[] args) {
		Sasi_Medhod_Calling_Bank2 NewCustomer = new Sasi_Medhod_Calling_Bank2();
		NewCustomer.HelpDesk();
		NewCustomer.CashCounter();
		System.out.println("Bank Timing  = "+NewCustomer.Bank_Timing);
	}

}
