package _J_22_Inheritance;

 abstract class Bas { 
    Bas() { System.out.println("Base Constructor Called"); } 
    abstract void fun(); 
} 
class Derive extends Bas { 
    Derive() { System.out.println("Derived Constructor Called"); } 
     void fun() { System.out.println("Derived fun() called"); } 
} 
class classsub1 extends Derive{ 
	void Mainfun() { System.out.println("Derived mainfun() called"); }
    public static void main(String args[]) {  
    	classsub1 d = new classsub1();
    	//Derive d=new Derive();
   //Bas d = new Bas(); 
     d.fun();
     
     d.Mainfun();
     
    } 
} 