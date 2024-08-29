package _J_02_06_01_Return_Function;

public class Return_Payilagam_2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Return_Payilagam_2 return2 = new Return_Payilagam_2();
		int add_Two_numbers = return2.add_Two_numbers();
		System.out.println("add_Two_numbers ="+add_Two_numbers);
	}
	
private	int  add_Two_numbers() {
		int a =10;
		int b =30;
		int c =a+b;
		System.out.println("C Value = "+c);
		return c;

	}
}
