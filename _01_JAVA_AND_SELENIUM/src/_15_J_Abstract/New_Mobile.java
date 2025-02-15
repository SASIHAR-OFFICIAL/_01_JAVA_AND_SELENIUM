package _15_J_Abstract;

public class New_Mobile extends Mobile{

	public static void main(String[] args) {
		New_Mobile New_Mobile_Obj = new New_Mobile();
		New_Mobile_Obj.prize();
		New_Mobile_Obj.Shop_Name();
		
	}
	

	@Override
	void prize() {
		System.out.println("Rs.10,000/-");
	}

}
