package _J_15_02_Parameterized_Constructor;

public class School_Student {

	int Marks;
	String Name;
	
	School_Student(int a, String b)  // <--- Constructor initialize default like this when we create object like below person person_object = new person();
	{
		Marks =a;
		Name = b;
		
	}
	
	public static void main(String[] args) {
		
		School_Student School_Student1 = new School_Student(51, "john");   
		// <---- When Object created above Constructor in name of  Class will be 
		//      created imaginary(Logically)  without showing like above
		School_Student School_Student2 = new School_Student(63, "somu");
		
		System.out.println(School_Student1.Marks);
		System.out.println(School_Student1.Name);
		
		System.out.println(School_Student2.Marks);
		System.out.println(School_Student2.Name);
		
	}

}
