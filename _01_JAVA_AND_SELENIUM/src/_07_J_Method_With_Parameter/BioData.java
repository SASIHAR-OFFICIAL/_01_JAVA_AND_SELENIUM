package _07_J_Method_With_Parameter;

public class BioData {

	void Name(String Name, char Inital,int DOB ) {
		System.out.println(Name);
		System.out.println(Inital);
		System.out.println(DOB);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BioData BioData_Object = new BioData();
		BioData_Object.Name("Sasi", 'S', 11);
	}

}
