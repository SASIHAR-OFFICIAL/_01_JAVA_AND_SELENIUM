package _J_02_06_04_Access_Modifier_Public_and_Private;

public class UTI_Customer {

	public static void main(String[] args) {

		UTI_bank Receptionist  = new UTI_bank();
		Receptionist.Interest_rate();
		Receptionist.Money_Transfer();
		Receptionist.Manager_salay();
		
		// Here above Manager_salay() shows error due to PRIVATE METHOD
	}

}
