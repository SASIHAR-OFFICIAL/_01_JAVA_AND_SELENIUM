package _00_Java_IT_ST_Bringed;
class Method_Overriding{
	//Overridden method
	void disp()
	{
		int b=20;
		int a=10;
		a=a+b;
		System.out.println("disp() method of parent1 class");
	}

	void disp1()
	{
		System.out.println("disp() method of parent2 class");
	}

}
class methodclass extends Method_Overriding{
	//Overriding method
	void disp(){
		System.out.println("disp() method of Child1 class");
	}
	void disp1()
	{
		System.out.println("disp() method of Child2 class");
	}

	public void newMethod(){
		System.out.println("new method of main class");
	}

	public static void main( String args[]) {
		/* When Parent class reference refers to the parent class object
		 * then in this case overridden method (the method of parent class)
		 *  is called.*/

		Method_Overriding x = new Method_Overriding();
		x.disp();
		x.disp1();
		/* When parent class reference refers to the child class object
		 * then the overriding method (method of child class) is called.
		 * This is called dynamic method dispatch and runtime polymorphism
		 */
		Method_Overriding y = new methodclass();
		y.disp();
		y.disp1();

		methodclass z = new methodclass();
		z.newMethod();

	}


}



