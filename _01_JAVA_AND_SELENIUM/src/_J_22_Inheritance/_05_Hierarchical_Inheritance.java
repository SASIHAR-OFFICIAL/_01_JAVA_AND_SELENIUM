package _J_22_Inheritance;

class Animal_Creatures1{                       // Super Class
	void Eat()
	{
		System.out.println("Eat");
	}}

class Home_Dogs1 extends Animal_Creatures{				// Sub Classes
	void Bark() 
	{
		System.out.println("Bark");
	}
}

class Puppy1 extends Animal_Creatures {				// Sub Classes
	void roams() {
		System.out.println("roams");		
	}
}

public class _05_Hierarchical_Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Puppy1 Puppy_1 = new Puppy1();
		Puppy_1.roams();
		Puppy_1.Eat();
		
	}}
