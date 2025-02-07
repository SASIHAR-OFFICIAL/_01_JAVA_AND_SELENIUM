package _05_J_Return_Function;
//From pailagam

public class Return_Payilagam_1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Return_Payilagam_1 add2nos = new Return_Payilagam_1();
		int Total2 =add2nos.add();
		System.out.println("Total 2 is ::" +Total2);
		
		}
	private int add() {
		// TODO Auto-generated method stub
		int a = 10, b = 10;
		int c = a+b;
		System.out.println("Total 1 is " +c);
		return c;
		
	}

}
