package _07_J_Method_With_Parameter;

public class CALCULATIONS {

	public static void main(String[] args) {

		CALCULATIONS OBJ = new CALCULATIONS();
		OBJ.add(3,1,86);
		
	}

	void add(int a,int b, int c){
		int Birthday_Total = a+b+c;
		System.out.println("Birthday_Total ="+Birthday_Total);
		
	}
}

