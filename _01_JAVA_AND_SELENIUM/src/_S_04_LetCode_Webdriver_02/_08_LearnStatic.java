package _S_04_LetCode_Webdriver_02;

public class _08_LearnStatic {
	
	int x = 0;
	static int y =0;
	
	void counter() {
		x++;
		y++;
		System.out.println("non-static => "+x+ " static => "+y);
	}
	
	public static void main(String[] args) {
		_08_LearnStatic ls = new  _08_LearnStatic();
		ls.counter();
		ls.counter();
		System.out.println("Once again created object");
		_08_LearnStatic ls2 = new  _08_LearnStatic();
		ls2.counter();
		ls2.counter();
		_08_LearnStatic ls3 = new  _08_LearnStatic();
		ls3.counter();
		ls3.counter();
		
		
	}

}
