package _J_22_Inheritance;

class A{
	int salary = 1000;
	//System.out.println("From parent class  " + salary);
}



public class meth extends A {
	 int c = 500;
	
	
	public static void main(String[] args) {
		
		meth b = new meth();
		System.out.println("From child Class  "+b.c);
		System.out.println("From parent Class  "+b.salary);
	}

}
