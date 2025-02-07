package _J_02_03_04_Method_Overriding_POLYMORPHISM;

public class SURYA extends SIVAKUMAR {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SURYA SURYA_OBJ =new SURYA();
		SURYA_OBJ.job();            // call's this class method JOB and print SURYA ACTING
		SURYA_OBJ.production();		// call's this class method PRODUCTION and print SURYA ACTING and print's 
									// SIVAKUMAR ACTING (due to usage of super class) super class is used to call super CLASS(PARENT CLASS)
	}
protected void production() {
		//System.out.println("OWN PRODUCTION");
		this.job();					// THIS calls this class method again it print SURYA ACTING SIVAKUMAR ACTING
		
	}
	void job() {

		System.out.println("SURYA ACTING");
		super.job();
	}
	
	
}