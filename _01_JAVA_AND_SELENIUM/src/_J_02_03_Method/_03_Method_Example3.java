package _J_02_03_Method;

public class _03_Method_Example3 {

	
	//  static method can call static without object
	
	void Greeting()
	{
		String Vanakam = "hi";
//		System.out.println(Vanakam);
		byebye();
	}
	
	void byebye() {
		System.out.println("Bye Bye");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		_03_Method_Example3 obj = new _03_Method_Example3();
		obj.Greeting();
	
	}

}
