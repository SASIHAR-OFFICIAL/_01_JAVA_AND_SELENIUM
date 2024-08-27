package _00_Java_IT_ST_Bringed;
//Let us see another example of default constructor  
//which displays the default values  
public class Default_Constructor {
		int id=100;  
		String name="Gopi";
		
		Default_Constructor(){
				
			System.out.println(id+" "+name);
		}
				
				//method to display the value of id and name  
		 void display(){
			 int i=id;
				
			System.out.println(id+" "+name);
			
			}  
	public static void main(String args[]){  
		//creating objects  
			Default_Constructor s1=new Default_Constructor();  
			
			Default_Constructor s2=new Default_Constructor();  
		//displaying values of the object  
		s1.display();  
		s2.display();  
		}  

}

