package _14_J_02_super_KEYWORD_Method;

// SUPER IS KEYWORD
// SUPER IS KEYWORD CREATE IMAGING/LOGICALLY IN EVERY CLASS
// SUPER IS KEYWORD IS USED TO ACCESS FIELD LIKE INT, STRING, CALL FUNCTION AND ASSIGN A VARIBALE
class animal{
	int age=12;
	animal(String name){
		System.out.println(name);		
	}
	void Animal_Makes_sound(){
		System.out.println("Animal_Makes_sound");
	}
}

class dogs extends animal{
	public dogs() {
		super("monkey");
		super.Animal_Makes_sound();
		System.out.println("DOGS");
		System.out.println(super.age);

	}
}
public class Animals_in_Zoo_and_Home {

	public static void main(String[] args) {
		dogs dogs_1 = new dogs();
		
	}

}
