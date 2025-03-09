package _16_J_Dynamic_Binding;

public class Animal {

		    void sound() {
	        System.out.println("Animal makes a sound");
	    }
	

		    public static void main(String[] args) {
	        Animal myAnimal = new Animal();  // Animal object
	        Animal myDog = new Dog();        // Dog object (upcasted to Animal)
	        Animal myCat = new Cat();        // Cat object (upcasted to Animal)

	        myAnimal.sound();  // Output: Animal makes a sound
	        myDog.sound();     // Output: Dog barks
	        myCat.sound();     // Output: Cat meows
	    }
	}

//முக்கிய குறிப்பு:

//Dynamic Binding runtime-இல் நடைபெறும்.
//இது method overriding மற்றும் polymorphismயை பயன்படுத்தி செயல்படும்.

//Dynamic Binding பயன்பாடு நம்மை உறுதி செய்கிறது, நாம் ஒரு பெரிய object-oriented 
//நிரல் எழுதும்போது செயல்பாடு மற்றும் மேம்பாட்டுகளை சரியாக தேர்வு செய்ய முடியும்.

//இந்த உதாரணத்தில்:Dog மற்றும் Cat வகைகள், Animal வகையை மீறுகின்றன (override).
//myDog.sound() மற்றும் myCat.sound() என்ற கட்டளைகள் Dynamic Binding மூலம் 
//runtime-இல் சரியான sound() முறையை அழைக்கும்.

//Dynamic Binding யாருக்கு முக்கியம்?

//Polymorphism: பயனர் சொற்களை அல்லது செயல்பாடுகளை ஒரே பெயர் கொண்டு பல 
//விதமாக செயல்படுத்த முடியும்.
//Flexible code: class hierarchies-இல் செயல்பாடுகளை நேர்மறையாக நிரலை எழுத முடியும்.
