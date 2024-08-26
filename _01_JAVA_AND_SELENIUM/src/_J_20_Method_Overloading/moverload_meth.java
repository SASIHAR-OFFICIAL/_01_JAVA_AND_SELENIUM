package _J_20_Method_Overloading;

class A{
	int salary = 1000;
	//System.out.println("From parent class  " + salary);
}

public class moverload_meth extends A {
	 int c = 500;
		
	public static void main(String[] args) {
		
		moverload_meth b = new moverload_meth();
		System.out.println("From child Class  "+b.c);
		System.out.println("From parent Class  "+b.salary);
	}

}
