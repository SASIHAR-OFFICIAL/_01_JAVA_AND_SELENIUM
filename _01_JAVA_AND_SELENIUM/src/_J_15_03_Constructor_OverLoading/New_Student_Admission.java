package _J_15_03_Constructor_OverLoading;

public class New_Student_Admission {
	String UG_NAME, PG_Name, School, CityName, CollegeName;
	int TenthMarks, PLUSTWOMARKS, UGPERCENTAGE;
	public New_Student_Admission(String StudentName1, int SSLCMraks, int PlusTwoMarks, String SchoolName, String city) {
		UG_NAME = StudentName1;
		TenthMarks = SSLCMraks;
		PLUSTWOMARKS = PlusTwoMarks;
		School = SchoolName;
		CityName = city;
		System.out.println("Student 1 name = "+UG_NAME);
		System.out.println("Student 1 TenthMarks = "+TenthMarks);
		System.out.println("Student 1 PLUSTWOMARKS = "+PlusTwoMarks);
		System.out.println("Student 1 School = "+School);
		System.out.println("Student 1 CityName = "+CityName);
}
	public New_Student_Admission(String StudentName2, int UGPercentage, String UG_CollegeName) {
		PG_Name = StudentName2;
		UGPERCENTAGE = UGPercentage;
		CollegeName = UG_CollegeName;
		System.out.println("Student 2 name = "+StudentName2);
		System.out.println("Student 1 UGPERCENTAGE = "+UGPercentage);
		System.out.println("Student 1 CollegeName = "+UG_CollegeName);
	}
	public static void main(String[] args) {
		New_Student_Admission UG1 = new New_Student_Admission("Ajay", 305, 1080, "Rangamal", "Coimbatore");
		New_Student_Admission PG1 = new New_Student_Admission("kumar", 98, "K_G_Arts");
		UG1.UG_Admission();
		PG1.PG_Admission();
	}
	private void PG_Admission() {
		// TODO Auto-generated method stub
		System.out.println("PG_Admission");
	}
	private void UG_Admission() {
		// TODO Auto-generated method stub
		System.out.println("UG_Admission");

	}
}
