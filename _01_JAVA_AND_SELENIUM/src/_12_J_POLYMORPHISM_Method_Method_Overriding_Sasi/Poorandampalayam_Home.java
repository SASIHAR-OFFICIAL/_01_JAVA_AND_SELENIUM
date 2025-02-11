package _12_J_POLYMORPHISM_Method_Method_Overriding_Sasi;

public class Poorandampalayam_Home extends Gandhipuram_Home  {
	void bath(){
		System.out.println("Hot Water");
		super.bath();
	}
	void eating() {
		System.out.println("Mom Cook");
		super.eating();
	}
		
	public static void main(String[] args) {
		Poorandampalayam_Home  object = new Poorandampalayam_Home();
		
		object.bath();
		object.eating();
		
		
	}}
