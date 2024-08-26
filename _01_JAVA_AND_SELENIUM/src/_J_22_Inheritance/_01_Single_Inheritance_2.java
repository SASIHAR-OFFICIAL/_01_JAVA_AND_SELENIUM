package _J_22_Inheritance;

class Forest_Creatures{                       // Super Class
	void Eat()
	{
		System.out.println("Eat");
	}}

class Home_Dog extends Forest_Creatures{				// Sub Classes
	void Bark() 
	{
		System.out.println("Bark");
	}
}

public class _01_Single_Inheritance_2 {
	public static void main(String[] args) {

		Home_Dog Dog_1 = new Home_Dog();
		Dog_1.Eat();
		Dog_1.Bark();
	}}
