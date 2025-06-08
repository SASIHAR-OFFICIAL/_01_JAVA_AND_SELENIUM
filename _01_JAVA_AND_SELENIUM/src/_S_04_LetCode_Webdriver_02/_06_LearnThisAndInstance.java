package _S_04_LetCode_Webdriver_02;

public class _06_LearnThisAndInstance {
	
	int d; // instance variable
	
	int num() {
		return 1;
	}
	
	void addTwoNumbers(int a, int b) {
		int c = 20; // local variable
		System.out.println(a+b+d);
		
//		System.out.println(c);
	}
	
	public static void main(String[] args) {
		_06_LearnThisAndInstance ls = new _06_LearnThisAndInstance();
		ls.addTwoNumbers(10, 5);
//		this.
	}
}
