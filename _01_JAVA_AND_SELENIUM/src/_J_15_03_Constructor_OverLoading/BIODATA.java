package _J_15_03_Constructor_OverLoading;
public class BIODATA {
	public BIODATA(String name1, int age1) {
		System.out.println("Name = "+name1);
		System.out.println("Age = " +age1);
		System.out.println("-----------------------------");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BIODATA Person_1 = new BIODATA("Ramu", 26);
		BIODATA Person_2 = new BIODATA("SOMU",38);
		BIODATA Person_3 = new BIODATA("Arun", 31);
		
	}

}
