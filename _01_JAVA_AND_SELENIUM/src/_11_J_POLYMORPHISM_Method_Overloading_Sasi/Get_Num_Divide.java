package _11_J_POLYMORPHISM_Method_Overloading_Sasi;

import java.util.Scanner;

public class Get_Num_Divide {

	int div(int a, int user_input, int c) {
		
		a=50;
		//user_input =10;
				
		return c=a/user_input;
	}

		int div(int b, int user_input2, int d, int j) {
			
			b=500;
			//user_input2 = 10;
					
			return d=b/user_input2;
		}
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int user_input  = scan.nextInt();
		int user_input2 = scan.nextInt();
		
		Get_Num_Divide output = new Get_Num_Divide();
	
		int Div_value =output.div(0, user_input, 0);
		System.out.println("Div_value = "+Div_value);
		
		int Div_value2 = output.div(0, user_input2, 0, 0);
		System.out.println("Div_value2 = "+Div_value2);
	}

}

