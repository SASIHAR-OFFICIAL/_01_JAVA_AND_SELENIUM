package _J_02_03_03_Method_Overloading_POLYMORPHISM_Sasi;

public class Sasi_Degree {

	void DEGREE(String Diploma ) {

		System.out.println(Diploma);
	}

	void DEGREE(String Diploma,String Ug_Open) {
		
		System.out.println(Diploma+"\n"+Ug_Open);

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Sasi_Degree Sasi_Degree_Obj = new Sasi_Degree();

		Sasi_Degree_Obj.DEGREE("SRPC");
		Sasi_Degree_Obj.DEGREE("SRPC", "Bsc");


	}

}
