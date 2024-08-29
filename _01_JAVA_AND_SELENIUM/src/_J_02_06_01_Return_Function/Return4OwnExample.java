package _J_02_06_01_Return_Function;
public class Return4OwnExample {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Return4OwnExample Subraction = new Return4OwnExample();
		int FromSubraction = Subraction.Subract();
		System.out.println("From Subraction =" +FromSubraction);
	}
	private int Subract() {
		// TODO Auto-generated method stub
		int b = 105, a = 95;
		int c = b-a;
		System.out.println("Subraction Result = " +c);
		return c;
	}

}
