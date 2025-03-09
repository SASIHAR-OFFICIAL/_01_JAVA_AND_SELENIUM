package _16_Upcasting_and_Downcasting;

//Downcasting (Narrowing)

//Converting a superclass reference back to a subclass.
//Requires explicit casting.
//Should be used carefully to avoid ClassCastException.

public class Downcasting_or_Narrowing {

	public static void main(String[] args) {

	     Animal myAnimal = new Dog(); // Upcasting
	        Dog myDog = (Dog) myAnimal;  // Downcasting

	        myDog.makeSound();
	        myDog.bark(); // Now accessible
	    }
	}