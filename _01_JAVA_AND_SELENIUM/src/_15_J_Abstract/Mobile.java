package _15_J_Abstract;

//Abstract class
public abstract class Mobile {

 // Abstract method (no body)
 abstract void prize();

 // Concrete method (has body)
 protected void Shop_Name() {
     System.out.println("Poorvika");
 }

 // main method
 public static void main(String[] args) {
     // You cannot do: Mobile mobile = new Mobile(); ❌

     // Instead, create object of subclass
     Mobile samsung = new Samsung();
     samsung.Shop_Name();
     samsung.prize();
 }
}

//Subclass extending abstract class
class Samsung extends Mobile {

 // Must implement abstract method
 @Override
 void prize() {
     System.out.println("Samsung price is 20,000");
 }
}