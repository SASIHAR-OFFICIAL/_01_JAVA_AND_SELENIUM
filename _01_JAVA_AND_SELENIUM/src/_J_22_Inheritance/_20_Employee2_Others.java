package _J_22_Inheritance;



	class Programmer extends Employee {
	 int bonus=10000;
	 public class Employee2 {

		 float salary=40000;
		}
	 public static void main(String args[]){
	   Programmer p=new Programmer();
	   System.out.println("Programmer salary is:"+p.salary);
	   System.out.println("Bonus of Programmer is:"+p.bonus);
	}
	}