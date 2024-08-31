package _J_02_06_05_Method_Overloading_POLYMORPHISM;

public class India {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		India state = new India();
		state.Tamil_Nadu("Tamil", "South India", 1);
		state.Madhya_Pradesh("Hindhi", "Centre", 2);

	}

	private void Tamil_Nadu(String lang, String Location, int i) {

		System.out.println(lang+" "+Location+" "+i);
	}

	private void Madhya_Pradesh(String lang2, String Location2, int i) {
		
		System.out.println(lang2+" "+Location2+" "+i);
		
	}
}