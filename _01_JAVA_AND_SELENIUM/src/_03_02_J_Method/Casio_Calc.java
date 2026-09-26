package _03_02_J_Method;

public class Casio_Calc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 int num_From_Num_3 = Casio_Calc.addition(5, 6, 0);
		 					Casio_Calc.subtract(num_From_Num_3);
		
		
	}

	
	private static int addition(int num_1,int num_2,int num_3) {
		num_3 = num_1+num_2;
		System.out.println(num_3);
		return num_3;
	}

	private static void subtract(int num_From_Num_3_has_input) {
		
		int num_4_output = num_From_Num_3_has_input-5;
		System.out.println("num_4_output = "+num_4_output);
	}

}
