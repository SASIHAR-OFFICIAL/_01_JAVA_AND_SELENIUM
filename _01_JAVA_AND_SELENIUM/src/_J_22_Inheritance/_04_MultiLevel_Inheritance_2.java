package _J_22_Inheritance;

class Animal_Creatures{                       // Super Class
	void Eat()
	{
		System.out.println("Eat");
	}}

class Home_Dogs extends Animal_Creatures{				// Sub Classes
	void Bark() 
	{
		System.out.println("Bark");
	}
}

class Puppy extends Home_Dogs {				// Sub Classes
	void roams() {
		System.out.println("roams");		
	}
}


public class _04_MultiLevel_Inheritance_2 {
	public static void main(String[] args) {

		Puppy Puppy_1 = new Puppy();
		Puppy_1.roams();
		Puppy_1.Bark();
		Puppy_1.Eat();
	}}
