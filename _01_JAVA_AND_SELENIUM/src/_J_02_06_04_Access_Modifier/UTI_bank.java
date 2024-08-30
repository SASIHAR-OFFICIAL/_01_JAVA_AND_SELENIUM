package _J_02_06_04_Access_Modifier;

public class UTI_bank {

	int Interest_rate = 8;
	public void Interest_rate() {
		System.out.println("Interest_rate = "+Interest_rate+"%");
	}

	public void Money_Transfer() {
		System.out.println("NEFT or RTGS Avialble");
	}
	public void UPI() {
		System.out.println("UPI Not-Avialble");
	}

	private void Manager_salay() {
		System.out.println("Manager_salay = ");
	}

	
}
