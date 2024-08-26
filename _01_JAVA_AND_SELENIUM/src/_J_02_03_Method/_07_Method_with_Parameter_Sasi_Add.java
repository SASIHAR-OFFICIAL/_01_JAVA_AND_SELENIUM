package _J_02_03_Method;

public class _07_Method_with_Parameter_Sasi_Add {
	
	void sum(int add ) {
		
		System.out.println("Add = "+add);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 15;
		int b = 25;
		
		_07_Method_with_Parameter_Sasi_Add Get_add_Output = new _07_Method_with_Parameter_Sasi_Add();
		Get_add_Output.sum(a+b); 
	}

}
