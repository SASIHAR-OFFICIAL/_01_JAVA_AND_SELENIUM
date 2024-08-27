package _00_Java_IT_ST_Bringed;


	abstract class Bas { 
	    abstract void fun();
	    void run() {System.out.println("Base run() called");}
	} 
	class Derived extends Bas { 
	    void fun() { System.out.println("Derived fun() called"); } 
	} 
	class classtoinherit { 
	    public static void main(String args[]) {  
	      
	        // Uncommenting the following line will cause compiler error as the  
	        // line tries to create an instance of abstract class. 
	        //Base5 b = new Base5(); 
	  
	        // We can have references of Base type. 
	    
	    	Derived b = new Derived(); 
	        b.fun();  
	        b.run();
	    } 
	} 

