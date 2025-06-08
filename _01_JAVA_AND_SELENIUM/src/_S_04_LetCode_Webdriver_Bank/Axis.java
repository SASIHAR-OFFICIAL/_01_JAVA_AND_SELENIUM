package _S_04_LetCode_Webdriver_Bank;

public class Axis implements RBI {
	
	
	public void interestFreeLoan() {
//		RBI.UPILimit = 1;
		System.out.println("Free loan");
	}

	@Override
	public void aadharMandatory() {
		System.out.println("Aadhar added");
		
	}

	@Override
	public boolean panMandatory() {
		return true;
	}

	@Override
	public void aadharMandatory(boolean a) {
		// TODO Auto-generated method stub
		
	}

}
