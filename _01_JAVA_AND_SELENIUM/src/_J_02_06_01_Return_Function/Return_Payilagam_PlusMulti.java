package _J_02_06_01_Return_Function;
public class Return_Payilagam_PlusMulti {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Return_Payilagam_PlusMulti Add2Value = new Return_Payilagam_PlusMulti();
		int total2 = Add2Value.add();
		System.out.println("Total 2 = " +total2);
		Return_Payilagam_PlusMulti.Multiply(total2);
					}
	private static void Multiply(int total3) {
		// TODO Auto-generated method stub
		total3 =total3*2;
		System.out.println("Return Plus Multi = "+total3);
	}

	private int add() {
		// TODO Auto-generated method stub
		int a=23, b= 27;
		int c= a+b;
		System.out.println("Total 1 = " +c);
		return c;
	}

}
