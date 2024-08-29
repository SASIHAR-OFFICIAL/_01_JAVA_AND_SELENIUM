package _J_02_06_01_Return_Function;
public class ReturnAddWithSubtract {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReturnAddWithSubtract AddData = new ReturnAddWithSubtract();
		int AddOutput = AddData.Add();
		ReturnAddWithSubtract.sub(AddOutput);
	}
		private static void sub(int addOutput) {
		// TODO Auto-generated method stub
		int subtract_output = addOutput-10;
		System.out.println("subtract output " +subtract_output);
	}
	private int Add() {
		// TODO Auto-generated method stub
		int a=12, b=34;
		int c=a+b;
		System.out.println("Add Output " +c);
		return c;
	}
}
