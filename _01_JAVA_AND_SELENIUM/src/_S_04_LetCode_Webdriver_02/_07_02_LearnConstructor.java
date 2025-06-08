package _S_04_LetCode_Webdriver_02;

public class _07_02_LearnConstructor {
	
	/*
	 * public LearnConstructor() { this.x = 1000; }
	 */
	
	
	protected _07_02_LearnConstructor(int x) {
		this.x = x;
	}
	public _07_02_LearnConstructor(int x, String s) {
		this.x = x;
		this.name = s;
	}
	
	int x;
	String name;
	
	void display() {
		System.out.println(x+ "--> "+ name);
	}
	public static void main(String[] args) {
		_07_02_LearnConstructor ls = new _07_02_LearnConstructor(1000);
		ls.display();
		_07_02_LearnConstructor ls1 = new _07_02_LearnConstructor(100, "LetCode");
		ls1.display();
	}

}
