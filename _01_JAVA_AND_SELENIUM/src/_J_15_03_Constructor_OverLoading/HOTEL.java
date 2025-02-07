package _J_15_03_Constructor_OverLoading;
public class HOTEL {
	String BREAKFAST1,BREAKFAST2,BREAKFAST3,MEALS,BIRIYANI,TIFFEN1,TIFFEN2,TIFFEN3,TIFFEN4;
	int i;
	public HOTEL(String BREAKFAST1, String BREAKFAST2, String BREAKFAST3, int i) {
		System.out.println("BREAKFAST ITEMS = " +BREAKFAST1);
		System.out.println("BREAKFAST ITEMS = " +BREAKFAST2);
		System.out.println("BREAKFAST ITEMS = " +BREAKFAST3);
		System.out.println("BREAKFAST PRICE = " +i);
		System.out.println("------------------------------------------------------");
	}
	public HOTEL(String MEALS, String BIRIYANI, int i) {
		System.out.println("BREAKFAST ITEMS = " +MEALS);
		System.out.println("BREAKFAST ITEMS = " +BIRIYANI);
		System.out.println("BREAKFAST PRICE = " +i);	
		System.out.println("------------------------------------------------------");
	}
	public HOTEL(String TIFFEN1, String TIFFEN2, String TIFFEN3, String TIFFEN4, int i) {
		System.out.println("BREAKFAST ITEMS = " +TIFFEN1);
		System.out.println("BREAKFAST ITEMS = " +TIFFEN2);
		System.out.println("BREAKFAST ITEMS = " +TIFFEN3);
		System.out.println("BREAKFAST ITEMS = " +TIFFEN4);
		System.out.println("BREAKFAST PRICE = " +i);
		System.out.println("------------------------------------------------------");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HOTEL BREAKFAST = new HOTEL("POORI","DOSA","IDLI",30);
		HOTEL LUNCH = new HOTEL("MEALS", "BIRIYANI",60);
		HOTEL TIFFEN = new HOTEL("POROTA","CHAPPATHI","IDLI", "DOSA", 40);
		BREAKFAST.menu1();
		LUNCH.menu2();
		TIFFEN.menu3();
	}
	private void menu3() {
	}
	private void menu2() {
	}
	private void menu1() {
	}
}
