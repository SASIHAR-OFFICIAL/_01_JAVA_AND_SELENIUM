package _10_J_ENCAPSULATION_Private;

public class RBI {

	public static void main(String[] args) {

		RBI RBI_Obj = new RBI();
		RBI_Obj.Banking_Operations_Not_handled();
		}

	private void Banking_Operations_Not_handled() {
		System.out.println("Banking Operations Not Handled Because it is PRIVATE");
		System.out.println("So PRIVATE METHOD can be called by its own class OBJECT");

	}

}
