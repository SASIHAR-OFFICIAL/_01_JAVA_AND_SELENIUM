package _J_15_01_Constructor;
//Let us see another example of default constructor  
//which displays the default values  
public class construtorp_condefalult {
		int id=100;  
		String name="Gopi";
		
		construtorp_condefalult(){
				
			System.out.println(id+" "+name);
		}
				
				//method to display the value of id and name  
		 void display(){
			 int i=id;
				
			System.out.println(id+" "+name);
			
			}  
	public static void main(String args[]){  
		//creating objects  
		construtorp_condefalult s1=new construtorp_condefalult();  
			
		construtorp_condefalult s2=new construtorp_condefalult();  
		//displaying values of the object  
		s1.display();  
		s2.display();  
		}  

}

