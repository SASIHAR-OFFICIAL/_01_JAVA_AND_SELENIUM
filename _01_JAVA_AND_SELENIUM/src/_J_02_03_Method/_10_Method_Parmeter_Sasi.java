package _J_02_03_Method;

public class _10_Method_Parmeter_Sasi {
	private void add(int a, int b) {
		// TODO Auto-generated method stub
		int c;
		System.out.println(c=a+b);
	}
	private void sub(int a, int b) {
		// TODO Auto-generated method stub
		int c;
		System.out.println(c=a-b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		_10_Method_Parmeter_Sasi calc = new _10_Method_Parmeter_Sasi();
		calc.add(10,5);
		calc.sub(10,5);
		calc.mul(10,5);
		calc.div(10,5);
	}

	private void mul(int a, int b) {
		int c;
		System.out.println(c=a*b);
	}
	private void div(int a, int b) {
		int c;
				System.out.println(c= a/b);

	}



}
