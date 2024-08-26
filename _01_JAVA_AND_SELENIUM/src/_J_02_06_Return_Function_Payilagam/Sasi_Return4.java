package _J_02_06_Return_Function_Payilagam;
public class Sasi_Return4 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sasi_Return4 Sub_inputs = new Sasi_Return4();
		Sub_inputs.Sub();
		int AB_Total =Sub_inputs.Sub();
		Sasi_Return4.mul(AB_Total);
	}
	private static void mul(int aB_Total) {
		// TODO Auto-generated method stub
		int Mul_Output = aB_Total*2;
		System.out.println("Multiply Output = " +Mul_Output);
	}
	private int Sub() {
		// TODO Auto-generated method stub
		int a = 60, b = 2, c = a/b;
		System.out.println("A B total = " +c);
		return c;		
	}
}
