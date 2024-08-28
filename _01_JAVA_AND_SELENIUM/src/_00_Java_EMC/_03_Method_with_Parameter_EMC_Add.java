package _00_Java_EMC;

public class _03_Method_with_Parameter_EMC_Add {
	
	void sum(int Num1,int Num2 ) {
		
		System.out.print("Add = ");
		System.out.print(Num1+Num2);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		_03_Method_with_Parameter_EMC_Add Get_add_Output = new _03_Method_with_Parameter_EMC_Add();
		
		Get_add_Output.sum(15,25); 
	}

}
