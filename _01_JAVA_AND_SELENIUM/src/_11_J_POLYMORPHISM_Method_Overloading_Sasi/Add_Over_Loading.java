package _11_J_POLYMORPHISM_Method_Overloading_Sasi;

public class Add_Over_Loading {

	private int sum (int a1,int b1) {
		
		return a1+b1;
		
	}
	private int sum (int d1,int e1,int f1) {
		
		return d1+e1;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Add_Over_Loading AOL_Object = new Add_Over_Loading();
		System.out.println(AOL_Object.sum(4, 4));
		System.out.println(AOL_Object.sum(5, 5, 5));
		
	}

}
