package _00_Java_IT_Sasi_Notes;

public class _07_Method {

	public void logicmethod() {
		int z=10;
		System.out.println(z);
	}
	public void logicmethod2() {
		int a,p = 1000, r=3, t=5;
		a=p*(1+r+t);
		System.out.println("Interest Value = "+a);
	}
	public void logicmethod3() {
		int h=80;
		System.out.println("Value = "+h);
	}
	public static void main(String[] args) {
		_07_Method e =new _07_Method();
		e.logicmethod();
		e.logicmethod2();
		e.logicmethod3();

	}

}


