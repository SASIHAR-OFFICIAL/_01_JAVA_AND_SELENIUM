package _J_15_03_Constructor_OverLoading;

public class Student_Admission {
	String Name, City;
	int SSLC, PlusTwo, UG;
	public Student_Admission (String STUDENTName, int TenthMarks, int PlusTwoMarks, String CityName) {
		Name = STUDENTName;
		SSLC = TenthMarks;
		PlusTwo = PlusTwoMarks;
		City = CityName;
		
		System.out.println("Name = "+Name);
		System.out.println("TenthMarks = "+SSLC);
		System.out.println("PlusTwoMarks = "+PlusTwoMarks);
		System.out.println("City = "+City);
	}
	
	public Student_Admission(int UGMARKS) {
		// TODO Auto-generated constructor stub
		UG = UGMARKS;
		System.out.println("UG = "+UGMARKS);

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student_Admission UG = new Student_Admission("Anbu", 302, 980, "Madurai");
		Student_Admission PG = new Student_Admission(9999);
		UG.applyloan();
		PG.applyloan();
	}
	private void applyloan() {
		// TODO Auto-generated method stub
		//System.out.println("Apply loan " +Name);
		}
	}
