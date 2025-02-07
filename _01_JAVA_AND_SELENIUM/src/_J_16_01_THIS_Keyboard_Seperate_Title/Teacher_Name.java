package _J_16_01_THIS_Keyboard_Seperate_Title;

public class Teacher_Name {

	String Teacher_Name1;
	String Teacher_Name2;
	String Teacher_Name3;
	String Teacher_Name4;

	void Display_Teacher_name1() {
		System.out.println("Display_Teacher_name1");
	}

	void Display_Teacher_name2(String a) {
		Teacher_Name2= a;
	}
	
	void Display_Teacher_name3(String Teacher_Name3) {
		this.Teacher_Name3= Teacher_Name3;
	}

	public static void main(String[] args) {

		Teacher_Name T1 = new Teacher_Name();
		T1.Display_Teacher_name1();

		Teacher_Name T2 = new Teacher_Name();
		T2.Display_Teacher_name2("Devaki");
		System.out.println(T2.Teacher_Name2);
		
		Teacher_Name T3 = new Teacher_Name();
		T3.Display_Teacher_name3("Viswanathan");
		System.out.println(T3.Teacher_Name3);
		
		

	}}
