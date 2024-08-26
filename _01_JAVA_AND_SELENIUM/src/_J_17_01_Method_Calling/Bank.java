package _J_17_01_Method_Calling;
public class Bank {
	private String name; 
	// bank name 
	Bank(String name) 
	{ 
		this.name = name; 
	} 

	public String getBankName() 
	{ 
		return this.name; 
	} 
} 

//employee class  
class Employee 
{ 
	private String name; 

	// employee name  
	Employee(String name)  
	{ 
		this.name = name; 
	} 

	public String getEmployeeName() 
	{ 
		return this.name; 
	}  
} 

//Association between both the  
//classes in main method 
class Association  
{ 
	public static void main (String[] args)  
	{ 
		Bank bank = new Bank("HSBC"); 
		Employee emp = new Employee("Geetha"); 

		System.out.println(emp.getEmployeeName() +  
				" is employee of " + bank.getBankName()); 
	} 
}

