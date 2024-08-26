package _J_02_06_Return_Function_Payilagam;

public class Return_Payilagam_WithDivide2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Return_Payilagam_WithDivide2 Addinput = new Return_Payilagam_WithDivide2();
		int Addoutput = Addinput.Add();
		Return_Payilagam_WithDivide2.Divide(Addoutput);
	}
	private static void Divide(int Addoutput) {
		// TODO Auto-generated method stub
		int e = Addoutput / 2;
		System.out.println("divide output = " + e);
	}
	private int Add() {
		// TODO Auto-generated method stub
		int a = 12, b = 38;
		int c = a + b;
		System.out.println("Add output = " + c);
		return c;
	}
}
