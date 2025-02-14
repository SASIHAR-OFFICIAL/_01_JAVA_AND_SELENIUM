package _14_J_01_this_KEYWORD_Varibale;

public class This_test_Variable {

	String Name;
	int Number;
	
	
	void Get_Name_Get_Number(String Name, int Number) {
		this.Name = Name;
		this.Number=Number;
	}
	
	public static void main(String[] args) {
		
		This_test_Variable This_test_Variable_Obj = new This_test_Variable();
		This_test_Variable_Obj.Get_Name_Get_Number("somu", 30); 
		
		System.out.println("Name ="+This_test_Variable_Obj.Name);
		System.out.println("Number ="+This_test_Variable_Obj.Number);
	}

}
