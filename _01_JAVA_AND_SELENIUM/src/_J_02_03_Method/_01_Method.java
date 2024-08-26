package _J_02_03_Method;

public class _01_Method {
	private void Add() {
		// TODO Auto-generated method stub
		int a = 15;
		int b = 5;	
		int c=a+b;
		System.out.println("a+b = "+c);
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		_01_Method Method_Name = new _01_Method();
		Method_Name.Add();
		Method_Name.Sub();
	}

	private void Sub() {
		// TODO Auto-generated method stub
		int a = 15;
		int b = 5;	
		int c=a-b;
		System.out.println("a-b = "+c);
	}

	

}
