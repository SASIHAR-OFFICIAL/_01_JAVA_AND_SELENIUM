package _J_15_02_Parameterized_Constructor;
//Java Program to demonstrate the use of parameterized constructor 
public class parameterconstructor {

	 int id;
	 String name;
	   //creating a parameterized constructor  
	     parameterconstructor(int i,String n){ 
	    	  	
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
	    	parameterconstructor s1 = new parameterconstructor(111,"Karan");  
	    	parameterconstructor s2 = new parameterconstructor(222,"Aryan");  
	    //calling method to display the values of object  
	  s1.display();  
	  // s2.display();  
	   }  
	}  

