package _00_Java_IT_ST_Bringed;
//Java Program to demonstrate the use of parameterized constructor 
public class Parameterized_Constructor {

	 int id;
	 String name;
	   //creating a parameterized constructor  
	     Parameterized_Constructor(int i,String n){ 
	    	  	
	    id = i;  
	    name = n;
	    System.out.println(id+" "+name);
	    }  
	    //method to display the values  
	      void display(){
	    	System.out.println(id+" "+name);
	    	
	    	}  
	   
	    public static void main(String args[]){  
	    //creating objects and passing values  
	    	Parameterized_Constructor s1 = new Parameterized_Constructor(111,"Karan");  
	    	Parameterized_Constructor s2 = new Parameterized_Constructor(222,"Aryan");  
	    //calling method to display the values of object  
	  s1.display();  
	  // s2.display();  
	   }  
	}  

