package _00_Java_IT_ST_Bringed_Exception_Handling;

public class arthmeticexp {
			 public static void main(String[] args) throws InterruptedException 
		    { 
		        int a = 10, b = 5, c = 5, result; 
		        try { 
		            result = a / (b - c); 
		            System.out.println("result" + result); 
		        } 
		      
		          catch (ArithmeticException e) { 
		            System.out.println("Exception caught:Division by zero"); 
		        } 
		        
		        finally {
		       	 System.out.println("I  am final block"); 
		       	 		        }
		        System.out.println("Executed outside finally block"); 		             
		       	       
		        result = a / (b - c); 
	            System.out.println("result" + result); 
		    } 	 
	}


