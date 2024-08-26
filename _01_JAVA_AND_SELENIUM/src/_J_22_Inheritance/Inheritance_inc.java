package _J_22_Inheritance;

public class Inheritance_inc extends tech{
	   public static void main(String args[]){
	//tech v=new tech();//While create object for SubClass which cannot call main class method
	
		   Inheritance_inc v = new Inheritance_inc();
	v.sub();
	v.add();

	//w.multi();
	v.multi();
	}
   private void multi() {
	   System.out.println("this is private method of main");
	  }}


class tech {
	   String Subject1 = "Physics";
	   String Subject2 = "Chemistry";
	   String IIT = "Enterance Score";
	   int totalmark=1089;
	   void add(){
		   int Phy=187, che=194;
		   int total;
		   total = Phy + che;
		System.out.println("Marks");
		System.out.println("Total Marks of Physics and Chemistry = " +total);
	   }
	  void sub() {
		   int a=1, b=2;
		   int c=b-a;
		 
		   System.out.println("sub value="+c);
	   }
	    
	}

	

	


