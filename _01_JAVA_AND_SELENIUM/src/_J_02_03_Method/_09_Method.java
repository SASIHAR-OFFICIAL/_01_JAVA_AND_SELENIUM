package _J_02_03_Method;

public class _09_Method {
	private void add() {
		// TODO Auto-generated method stub
		int a= 10,b=5; 
		int c = a+b;
		System.out.println(c);
	}
	private void sub() {
		// TODO Auto-generated method stub
		int a= 10,b=5; 
		int c = a-b;
		System.out.println(c);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		_09_Method calc = new _09_Method();
		calc.add();
		calc.sub();
		calc.mul();
		calc.div();
	}

	private void mul() {
		int a= 10,b=5; 
		int c = a*b;
		System.out.println(c);
	}
	private void div() {
		int a= 10,b=5; 
		int c = a/b;
		System.out.println(c);

	}



}
