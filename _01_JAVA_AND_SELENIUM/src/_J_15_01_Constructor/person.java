package _J_15_01_Constructor;

public class person {

	int Marks;
	String Name;
	
	person()  // <--- Constructor initialize default like this when we create object like below person person_object = new person();
	{
		System.out.println("Hello");
	}
	
	public static void main(String[] args) {
		
		person person_object1 = new person();   
		// <---- When Object created above Constructor in name of  Class will be 
		//      created imaginary(Logically)  without showing like above
		person person_object2 = new person();
		
		System.out.println(person_object1.Marks);
		System.out.println(person_object2.Name);
	}

}
