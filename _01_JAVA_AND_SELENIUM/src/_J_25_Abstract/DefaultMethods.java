package _J_25_Abstract;
public class DefaultMethods {
    interface Sayable{    
        // default method    
        default void say(){    
            System.out.println("Hello, this is default method");    
        }  }  }
        // Abstract method    
        //void sayMore(String msg);    
        // static method    
//        static void sayLouder(String msg){    
//            System.out.println(msg);    
//        }        
//        //}    
//     class DefaultMethods implements Sayable{    
//        public void sayMore(String msg){     // implementing abstract method    
//            System.out.println(msg);    
//        }    
       // public static void main(String[] args) {    
//            DefaultMethods dm = new DefaultMethods();    
//            dm.say();                       // calling default method    
//            dm.sayMore("Work is worship");      // calling abstract method    
//            Sayable.sayLouder("Helloooo...");   // calling static method    
//        }    
        //}   
        //}