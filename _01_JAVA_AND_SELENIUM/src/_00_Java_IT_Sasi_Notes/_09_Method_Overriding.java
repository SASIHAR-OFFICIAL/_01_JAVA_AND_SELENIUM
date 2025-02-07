package _00_Java_IT_Sasi_Notes;

//                   SAME METHOD NAME WITH SAME PARAMETERS MANY CLASS MANY METHOD

public class _09_Method_Overriding {

	public void disp() {
		System.out.println("Method of Parent Class");
	}
	public void disp1() {
		System.out.println("Method of Parent1 Class");
	}
	class Methods extends _09_Method_Overriding {
		public void disp() {
			System.out.println("Method of Child1 Class");
		}
		public void disp1() {
			System.out.println("Method of Child2 Class");
		}
		public void New_Method() {
			System.out.println("New Method of Main Class");
		}
		}

	public static void main(String[] args) {
		_09_Method_Overriding a = new _09_Method_Overriding();
		a.disp();
		a.disp1();
		
		_09_Method_Overriding b =new _09_Method_Overriding();
		b.disp();
		b.disp1();
		
		/*_09_Method_Overriding c = new _09_Method_Overriding();
		c.New_Method();*/
	}
}
