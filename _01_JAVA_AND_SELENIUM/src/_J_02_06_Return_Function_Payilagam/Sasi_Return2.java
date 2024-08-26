package _J_02_06_Return_Function_Payilagam;
public class Sasi_Return2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sasi_Return2 Two_Data_Input = new Sasi_Return2();
		int ValueofReturnK = Two_Data_Input.add();
		Sasi_Return2.div(ValueofReturnK);
					}

	private static void div(int valueofReturnK) {
		// TODO Auto-generated method stub
		int  DivideOutput = valueofReturnK/5;
		System.out.println("Divide Output = " +DivideOutput);
	}

	private int add() {
		// TODO Auto-generated method stub
		int I = 15, J = 20;
		int K = I+J;
		System.out.println("Two Data Input Total = " +K);
		return K;
			}

}
