package _J_24_Polymorphism;

public class objmulti {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal a;
		a=new Animal();
		a.eat();
		a=new Dog();  
		a.eat();
		//a.ate();
		a=new Cat();  
		a.eat();  
		a=new Lion();  
		a.eat(); 
		Dog d=new Dog();
		d.eat();
		d.ate();
		}
}
class Animal{  
void eat(){
	System.out.println("eating...");
	}  
}  
class Dog extends Animal{  
void eat(){
	System.out.println("eating bread...");
	}  
void ate(){
	System.out.println("eating bread...");
	}  
}  
class Cat extends Animal{  
void eat(){
	System.out.println("eating rat...");
	}  
}  
class Lion  extends Animal{  
void eat(){System.out.println("eating meat...");}  
}  
