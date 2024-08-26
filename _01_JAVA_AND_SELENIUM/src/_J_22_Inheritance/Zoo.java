package _J_22_Inheritance;

public class Zoo {

	public static class Animal{
		String Name;
		int age;
		void Make_Sound() {
			System.out.println("Animal makes sound");
		}
	}
	
	public static class Dog extends Animal{
		String Bread;
		@Override
		void Make_Sound() {
			System.out.println("Dog Barkes");
		}
		void fetch() {
			System.out.println("Dog is Fetching");
		}
	}
	public static class cat extends Animal{
		String Color;
		
		void Make_Sound() {
			System.out.println("Cat Meows");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal Animal_1 = new Animal();
		Animal_1.Name = "Elephat";
		Animal_1.age = 50;
		Animal_1.Make_Sound();
		System.out.println(Animal_1.Name);
		System.out.println("______________________");
		
		Animal_1.Make_Sound();
		Dog Dog_1 = new Dog();
		Dog_1.Name = "TIMMY";
		Dog_1.age =5;
		Dog_1.Bread="Domar Man";
		Dog_1.Make_Sound();
		Dog_1.fetch();
		System.out.println("______________________");
		
		cat cat_1 = new cat();
		cat_1.Name= "Pinky";
		cat_1.age=4;
		cat_1.Color = "White";
		System.out.println(cat_1.Color);
		cat_1.Make_Sound();
		
	}

}
