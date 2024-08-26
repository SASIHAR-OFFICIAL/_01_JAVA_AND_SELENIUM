package _J_02_06_Return_Function_Payilagam;
public class Return_Payilagam_WithMulti {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Return_Payilagam_WithMulti add2number = new Return_Payilagam_WithMulti();
		int multi =add2number.add();
	System.out.println("Multi input = " +multi);
	Return_Payilagam_WithMulti.MultiplyMethod(multi);
	}
	private static void MultiplyMethod(int multi) {
		// TODO Auto-generated method stub
		int d = multi*2;
		System.out.println("Multiply output = " +d);
	}
	private int add() {
		// TODO Auto-generated method stub
		int a = 16, b = 16;
		int c= a+b;
		System.out.println("add output = " +c);
		return c;
		
	}

}
