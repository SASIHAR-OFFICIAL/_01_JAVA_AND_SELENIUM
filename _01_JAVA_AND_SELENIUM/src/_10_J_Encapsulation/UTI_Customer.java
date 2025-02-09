package _10_J_Encapsulation;

public class UTI_Customer {

	public static void main(String[] args) {

		UTI_bank Receptionist  = new UTI_bank();
		Receptionist.Interest_rate();
		Receptionist.Money_Transfer();
		Receptionist.Manager_salay();
		
		// Here above Manager_salay() shows error due to PRIVATE METHOD
	}

}
