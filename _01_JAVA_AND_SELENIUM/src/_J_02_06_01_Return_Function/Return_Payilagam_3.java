package _J_02_06_01_Return_Function;
public class Return_Payilagam_3 {
	public static void main(String[] args) {
		
		Return_Payilagam_3 ReturnAdd = new Return_Payilagam_3();
		int int_Add =ReturnAdd.add();

		
		System.out.println("returnedADD = "+int_Add);
	}
	
	private int add() {
	
		int a = 5, b = 5;
		int add = a + b;
		System.out.println("Addition Total = " +add);
		return add;
	}
}
