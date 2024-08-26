package _J_02_03_Method;

public class _01_Method_Class {
	 
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
		_01_Method_Class a=new _01_Method_Class();
		
		a.logicMethod2();
		_01_Method_Class.logicMethod3(50);
		a.logicMethod1();
				
				    
	   }  

	  	   }

	


