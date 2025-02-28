package _00_Java_EMC_10_ENCAPSULATION;

public class Employee extends Person{

	public static void main(String[] args) {
		
		Employee obj = new Employee();
		String name2 = obj.name;
		int age2 = obj.age;
		int address2 = obj.address;
		
		System.out.println(name2);
		System.out.println(age2);
		System.out.println(address2);
	}

}
