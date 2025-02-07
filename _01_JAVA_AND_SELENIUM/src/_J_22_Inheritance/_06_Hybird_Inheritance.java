package _J_22_Inheritance;

class Animal_Creatures2{                       // Super Class
	void Eat()
	{
		System.out.println("Eat");
	}}

class Home_Dogs2 extends Animal_Creatures{				// Sub Classes
	void Bark() 
	{
		System.out.println("Bark");
	}
}

class Puppy2 extends Home_Dogs2 {				// Sub Classes
	void roams() {
		System.out.println("roams");		
	}
}


class Cat2 extends Animal_Creatures2{			// Sub Classes
	void Meow() {
		System.out.println("Says Meow");
	}
}

public class _06_Hybird_Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Puppy2 Puppy_2 = new Puppy2();
		System.out.println("Dogs does");
		Puppy_2.Eat();
		Puppy_2.Bark();
			
		Cat2 Cat_1 = new Cat2();
		System.out.println("________________________");
		System.out.println("Cat does");
		Cat_1.Eat();
	}}
