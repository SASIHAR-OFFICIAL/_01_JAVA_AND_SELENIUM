package _14_J_01_this_KEYWORD_Varibale;

public class This_Sasi {

	String name;
	

	void GetName(String name) {
		this.name="sasihar";
		String Short_Name = name;
		System.out.println("Short_Name = "+Short_Name);
		
	}
	


	public static void main(String[] args) {
		This_Sasi This_Sasi_Obj = new This_Sasi();
		This_Sasi_Obj.GetName("sasi");

		System.out.println("Full Name = "+This_Sasi_Obj.name);
		
	}

}
