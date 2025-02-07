package _00_Java_IT_ST_Bringed_Access_Modifier_Insideclass;

public class methodclass {
	private void pri() {
		int a=10, b=20;
		int c=a+b;
		System.out.println(c);
	}
	public void pub() {
		int a=10, b=20;
		int c=a-b;
		System.out.println(c);
	}
	protected void pro() {
		int a=10, b=20;
		int c=a*b;
		System.out.println(c);
	}
	 void def()
	{
		int a=10, b=20;
		int c=a*b;
		System.out.println(c);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		methodclass m=new methodclass();
m.pri();
m.pub();
m.pro();
m.def();
	}

}
