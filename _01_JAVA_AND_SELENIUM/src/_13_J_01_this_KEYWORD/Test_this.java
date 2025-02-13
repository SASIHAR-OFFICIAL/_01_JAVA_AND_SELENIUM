package _13_J_01_this_KEYWORD;

public class Test_this {

	String string;

	void Set_name(String string) {
		this.string = string;
		
	}

	public static void main(String[] args) {

		Test_this Test_this_Obj = new Test_this();
		Test_this_Obj.Set_name("ramu");
		System.out.println(Test_this_Obj.string);

	}


}
