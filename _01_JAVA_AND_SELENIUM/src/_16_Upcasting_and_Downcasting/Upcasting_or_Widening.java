package _16_Upcasting_and_Downcasting;

//Upcasting (Widening)

//Converting a subclass object to a superclass reference.
//Done implicitly.

public class Upcasting_or_Widening {
    public static void main(String[] args) {
        Animal myDog = new Dog(); // Upcasting (implicit)
        myDog.makeSound();
        // myDog.bark(); // Not accessible (requires downcasting)
    }
}