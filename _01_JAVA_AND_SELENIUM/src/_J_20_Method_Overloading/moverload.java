package _J_20_Method_Overloading;

class DisplayOverloading
{
	public  void display1(int a)
	{
		System.out.println( "value " +a);
	}
	public  void display(int a)
	{
		System.out.println( "value " +a);
	}
	public  static void display(char a, int num)  
	{
		int c=10,  b=30;
		num=c+b;
		System.out.println(a+" "+num);
	}
	public void display(String c)
	{
		System.out.println(c);
	}
	public void display11(int v)
	{

		System.out.println(v);
	}
	public void display(char v)
	{
		System.out.println(v);
	}
}
public class moverload {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DisplayOverloading w = new DisplayOverloading();
		w.display1(60);
		w.display("rate");
		DisplayOverloading.display('z',10);
		w.display1(88);
		w.display('r');
	}
}