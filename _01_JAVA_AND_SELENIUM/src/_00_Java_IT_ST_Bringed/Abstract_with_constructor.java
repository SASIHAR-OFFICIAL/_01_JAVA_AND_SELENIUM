package _00_Java_IT_ST_Bringed;

 abstract class Base { 
    Base() { System.out.println("Base Constructor Called"); } 
    abstract void fun(); 
} 
class Derive extends Base { 
    Derive() { System.out.println("Derived Constructor Called"); } 
     void fun() { System.out.println("Derived fun() called"); } 
} 
class Abstract_with_constructor extends Derive{ 
	void Mainfun() { System.out.println("Derived mainfun() called"); }
    public static void main(String args[]) {  
    	Abstract_with_constructor d = new Abstract_with_constructor();
    	//Derive d=new Derive();
   //Bas d = new Bas(); 
     d.fun();
     
     d.Mainfun();
     
    } 
} 