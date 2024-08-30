package _J_20_Method_Overloading;

public class moverload_methodclass_2 {
	 
	// method definition
	  void logicMethod1(){
		   int z=10;
	       System.out.println("execution of sub one " +z);
	   }
	 
public   void  logicMethod2() {
		   
		   int A, P=10000, r=3, t=5;
		   A = P*(1 + r*t) ;
		   
		   System.out.println("Interest value is " +A); 
			   }

public static int logicMethod3(int i){
			   int h=i;
		      System.out.println("execution of sub one " +h);
		       return(h);
		   }
		  
public static void main(String[] args) {
		// TODO Auto-generated method stub
	moverload_methodclass_2 a=new moverload_methodclass_2();
		a.logicMethod2();
		moverload_methodclass_2.logicMethod3(50);
		a.logicMethod1();
	    
	   }  

	  	   }

	


