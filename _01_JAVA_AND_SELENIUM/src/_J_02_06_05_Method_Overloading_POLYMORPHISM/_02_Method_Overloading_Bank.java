package _J_02_06_05_Method_Overloading_POLYMORPHISM;

public class _02_Method_Overloading_Bank {

	public static void main(String args[]) {

		_02_Method_Overloading_Bank customer_New = new _02_Method_Overloading_Bank();

		customer_New.Fill_loan_Form("Sasi", 97901,72006);
		customer_New.Fill_loan_Form("Srinivasan", 96266);
	}


	private void Fill_loan_Form(String Name1, int mob11, int mob12) {
		// TODO Auto-generated method stub
		System.out.println(Name1+" "+mob11+" "+mob12);
	}


	
	private void Fill_loan_Form(String Name2, int mob21) {
		// TODO Auto-generated method stub
		System.out.println(Name2+" "+mob21);
	}
}
