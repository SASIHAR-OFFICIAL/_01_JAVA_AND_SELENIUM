package _J_25_Abstract;
	abstract class Base {
		
	    abstract void fun();
	    void run() {
	    	System.out.println("Base run() called");
	    	}
	} 
	class Derived1 extends Base { 
	    void fun() { 
	    	System.out.println("Derived fun() called"); 
	    	} 
	} 
	class Abstract_classtoinherit { 
	    public static void main(String args[]) {  
	      
	        // Uncommenting the following line will cause compiler error as the  
	        // line tries to create an instance of abstract class. 
	       // Base b = new Base(); 
	  
	        // We can have references of Base type. 
	    
	    	Derived1 b = new Derived1(); 
	        b.fun();  
	        b.run();
	    } 
	} 

