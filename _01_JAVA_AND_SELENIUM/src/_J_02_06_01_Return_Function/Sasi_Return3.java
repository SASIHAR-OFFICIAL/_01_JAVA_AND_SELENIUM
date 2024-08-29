package _J_02_06_01_Return_Function;
public class Sasi_Return3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sasi_Return3 Input_For_Add = new Sasi_Return3();
		Input_For_Add.add();
		int AddTotal = Input_For_Add.add();
		Sasi_Return3.Div(AddTotal);
	}
	private static void Div(int addTotal) {
		// TODO Auto-generated method stub
		int Divide = addTotal/2;
		System.out.println("Divide output = "+Divide);
	}
	private int add() {
		// TODO Auto-generated method stub
		int x = 15, y = 25;
		int z = x + y;
		System.out.println("Input For Add Total = " + z);
		return z;
	}
}
