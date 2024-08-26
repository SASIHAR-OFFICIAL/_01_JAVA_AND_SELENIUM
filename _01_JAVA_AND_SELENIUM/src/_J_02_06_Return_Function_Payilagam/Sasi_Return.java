package _J_02_06_Return_Function_Payilagam;
public class Sasi_Return {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sasi_Return AddandSub = new Sasi_Return();
		int ReturnofC = AddandSub.Addition2(); // TODO Auto-generated method stub
		AddandSub.sub(ReturnofC);
		System.out.println("Return of C = "+ReturnofC);
	}
	private void sub(int ReturnofC) {
		// TODO Auto-generated method stub
		int d = ReturnofC - 10;
		System.out.println("After Subraction = "+d);
	}
	private int Addition2() {
		// TODO Auto-generated method stub
		int A = 63, B = 37;
		int C = A + B;
		System.out.println("Total of A and B is = " + C);
		return C;
	}
}
