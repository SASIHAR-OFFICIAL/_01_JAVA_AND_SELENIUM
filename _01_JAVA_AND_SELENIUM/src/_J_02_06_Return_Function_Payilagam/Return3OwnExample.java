package _J_02_06_Return_Function_Payilagam;
public class Return3OwnExample {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Return3OwnExample AddOuput = new  Return3OwnExample();
		int ReturnFromAdd2Data = AddOuput.Add2Data();
		System.out.println("ReturnFromAdd2Data = " + ReturnFromAdd2Data);
		}
	private int Add2Data() {
		// TODO Auto-generated method stub
		int a=15, b=25;
		int c =a+b;
		System.out.println("Add 2 Data = " +c);
		return c;
		}
}
