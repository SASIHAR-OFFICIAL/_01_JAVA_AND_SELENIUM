package _09_J_Main_Method_Not_Needed_Method_Calling_From_Other_Classes;

public class Bank_Axis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		bank_Interest b ;
		b = new Axis();
		b.sum();
	}
}
class bank_Interest{ 
	  void sum(){
		  float p  = 100087,n = 10,r = 3;
		 float SI =  (p * n* r)/100;
		  System.out.println(" The simple interest is:" +SI);} 
	}
class Axis extends bank_Interest{ 
	  void sum(){
		  int p = 200067,n = 5,r = 5;
		  float SI = (p * n * r)/100;
		  double IS = (p * n * r)/100;
		System.out.println(" The Simple interest is:"+SI);
		System.out.println(" The Simple interest is:"+IS);
	  } 
	}




