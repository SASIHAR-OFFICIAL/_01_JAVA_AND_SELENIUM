package _06_J_Return_Function_Unreachable_Code;

public class Sasi_Return5 {

	public static void main(String[] args) {
		
		Sasi_Return5 Sasi_Return5 = new Sasi_Return5();
		int retun_C = Sasi_Return5.add(10,5);
		System.out.println("int retun_C = "+ retun_C);

	}

	private int add(int a,int b) {
		int c =a+b;
		System.out.println("void add = "+c);
		return c;
		
		}

}
