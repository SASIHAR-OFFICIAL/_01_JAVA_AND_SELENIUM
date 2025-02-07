package _J_09_Nested_If;
public class _02_Nested_If_Payilagam {
public static void main(String[] args) {
//Creating two variables for age and weight    
int age=16;    
int weight=51;      

if(age>=18){       //applying condition on age and weight    
	        
	if(weight>50){    
	            System.out.println("You are eligible to donate blood");    
	        } else{  
	            System.out.println("You are not eligible to donate blood");    
	        }  
	    } else{  
	      System.out.println("Age must be greater than 18");  
	    }  
	}  }  