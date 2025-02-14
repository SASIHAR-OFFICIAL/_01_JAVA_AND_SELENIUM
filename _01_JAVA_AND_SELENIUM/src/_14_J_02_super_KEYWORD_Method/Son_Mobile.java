package _14_J_02_super_KEYWORD_Method;

public class Son_Mobile extends Dad_Mobile {
	
	
	void moible() {
		System.out.println("33443");
		super.moible();
	}
	

	public static void main(String[] args) {

		Son_Mobile Son_Mobile_Obj = new Son_Mobile();
		Son_Mobile_Obj.moible();
		int age = 38;
	}

}
