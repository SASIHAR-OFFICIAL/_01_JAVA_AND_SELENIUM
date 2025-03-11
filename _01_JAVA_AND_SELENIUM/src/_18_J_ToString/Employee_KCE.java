package _18_J_ToString;

public class Employee_KCE {

	int EMP_NUMBER=50;
	String EMP_NAME= "RAJ";

	public Employee_KCE(int EMP_NUMBER, String EMP_NAME) {
		this.EMP_NUMBER=EMP_NUMBER;
		this.EMP_NAME=EMP_NAME;
	}



	public static void main(String[] args) {

		Employee_KCE KCE_obj = new Employee_KCE(579, "SASI");   
		Employee_KCE KCE_obj1 = new Employee_KCE(600 ,"MOHAN"); // CONSTRUCTOR OVERLODING
		System.out.println(KCE_obj);
		
		System.out.println(KCE_obj1);
	}



	@Override
	public String toString() {
		return "EMP_NUMBER = " + EMP_NUMBER + ", EMP_NAME = " + EMP_NAME ;
	}

	
}
