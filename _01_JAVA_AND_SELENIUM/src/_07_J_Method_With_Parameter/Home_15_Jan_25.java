package _07_J_Method_With_Parameter;

public class Home_15_Jan_25 {

	private void GAN(String Location,int Distance) {
		System.out.println("Location = "+Location);
		System.out.println("Distance = "+Distance);

	}
	public static void main(String[] args) {
	 
		Home_15_Jan_25 object = new Home_15_Jan_25();
		object.GAN("Gandhipuram", 1);
		object.KUR("Kurumbsmpsalaysm", 8);
		
	}

	private void KUR(String Location,int Distance) {
		System.out.println("Location = "+Location);
		System.out.println("Distance = "+Distance);

		
	}

	

}
