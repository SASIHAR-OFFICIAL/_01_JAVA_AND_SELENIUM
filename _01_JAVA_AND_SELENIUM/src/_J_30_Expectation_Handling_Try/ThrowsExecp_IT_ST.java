package _J_30_Expectation_Handling_Try;

//Java program to demonstrate working of throws 
class ThrowsExecp { 

  // This method throws an exception 
 // to be handled 
 // by caller or caller 
 // of caller and so on. 
  
 
 void fun() throws IllegalAccessException 
 { 
     System.out.println("Inside fun(). "); 
     throw new IllegalAccessException("demo"); 
 } 

 // This is a caller function  
 public static void main(String args[]) 
 { 
     try {
    	 ThrowsExecp w= new ThrowsExecp();
         w.fun(); 
     } 
     catch (IllegalAccessException e) { 
         System.out.println("caught in main."); 
     } 
     finally {
    	 System.out.println("I  am final block"); 
    	 
     }
     System.out.println("Executed outside finally block"); 
 } 
 
} 


