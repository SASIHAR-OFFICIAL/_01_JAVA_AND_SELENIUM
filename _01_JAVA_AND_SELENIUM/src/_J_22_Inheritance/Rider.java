package _J_22_Inheritance;

class animal{
	void eat(){
		System.out.println("Animal eats");
		
	}
}

class dog extends animal{
	void bark() {
		System.out.println("Dog barks");
	}
}



public class Rider {

	public static void main(String[] args) {
		
  dog d = new dog();
  animal a = new animal();
  d.bark();
  d.eat();
  a.eat();
  
	}

}
