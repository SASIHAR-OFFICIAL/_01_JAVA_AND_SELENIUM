package _J_02_03_04_Method_Overriding_POLYMORPHISM_Sasi;

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
		// TODO Auto-generated method stub
		Poorandampalayam_Home  object = new Poorandampalayam_Home();
		
		object.bath();
		object.eating();
		
		
	}}
