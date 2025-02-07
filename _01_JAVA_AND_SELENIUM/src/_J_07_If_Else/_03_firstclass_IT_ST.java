package _J_07_If_Else;

public class _03_firstclass_IT_ST {

	public static int a=10,b=5,t;
	public static String str="wins";
	private static int c=10,d=5;
	protected static String s1="manuel";
	protected static int e=10,f=5;
	
	private static void t_pub()
	{
		t=c+f;
		System.out.println("enter the value of t" +t);
	}
	
	public static void pub_sv()
	{
		int z=10,x=5,v=20;
		if(z>9)
		{
			System.out.println("true");
		}
		else
		{
			System.out.println("false");
		}
	}
			
	protected static void pro_sv()
	{
		System.out.println(str);
		System.out.println("value of t:"+t);

	}
static void no_acc()
{
	System.out.println("th value of a"+a);
	System.out.println("the value of t"+t);
}

}


