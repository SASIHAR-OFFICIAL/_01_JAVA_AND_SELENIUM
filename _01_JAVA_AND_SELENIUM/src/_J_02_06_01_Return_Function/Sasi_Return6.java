package _J_02_06_01_Return_Function;

public class Sasi_Return6 {

	public static void main(String[] args) {
		
		Sasi_Return6 Money_Given = new Sasi_Return6();
		int Remain_Money=Money_Given.Purchase_Glocery(100,50);
		Money_Given.Deposit_in_Bank(Remain_Money);
	}

	

		private int Purchase_Glocery(int Given_Money, int oil) {
		int Remaing =Given_Money-oil;
		System.out.println("Remaing = "+Remaing);
		return Remaing;
	}
		private void Deposit_in_Bank(int remain_Money) {
			int Bank_Deposit =remain_Money;
			System.out.println("Bank_Deposited = "+Bank_Deposit);
		}
		
		

}
