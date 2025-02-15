package _14_J_02_super_KEYWORD_Variable;

public class _02_ATM_With_Draw extends _01_Bank_Balance {

	public static void main(String[] args) {
	
		_02_ATM_With_Draw _02_ATM_With_Draw_Obj = new _02_ATM_With_Draw();
		_02_ATM_With_Draw_Obj.Balance();
		
		
	}

	private void Balance() {
		int Bank_Balance = 900;
		System.out.println("After ATM withdraw = "+Bank_Balance);
		System.out.println("Before Bank Balance ="+super.Bank_Balance);
	}

}
