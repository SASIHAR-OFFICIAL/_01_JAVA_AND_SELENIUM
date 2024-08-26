package _J_02_06_Return_Function_Payilagam;

public class Return2OwnExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Return2OwnExample AddfromAdd = new Return2OwnExample();
		int ReturnOfK = AddfromAdd.add();
		System.out.println("ReturnOfK = "+ReturnOfK);
	}

	private int add() {
		// TODO Auto-generated method stub
		int i=14, j=16;
		int k=i+j;
		System.out.println("k =  " +k );
		return k;
	}

}
