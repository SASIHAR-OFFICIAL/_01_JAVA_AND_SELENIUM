package _00_Java_IT_Sasi_Notes;

//                                        SAME METHOD NAME WITH DIFFERENT TYPE OF PARAMETERS

public class _08_Method_Overloading {

	public void display(int a) {
		System.out.println("Mala = +a");
	}
	public static void display(char a, int num) {
		int c=10, b=30;
		num = c+b;
		System.out.println("Char Value "+a +"add value= "+num);
	}

	public void display(String c) {

		System.out.println("value of c = "+c);
	}
	/*public void display(int v) {
		System.out.println("value of c = "+v);
	}*/

	public void display(char v) {

		System.out.println("value of v = "+v);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		_08_Method_Overloading w = new _08_Method_Overloading();
		w.display(45);
		_08_Method_Overloading.display('m', 40);
		w.display("rate");
		w.display(88);
		w.display('0');
	}

}
