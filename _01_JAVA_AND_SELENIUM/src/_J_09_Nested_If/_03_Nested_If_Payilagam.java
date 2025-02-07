package _J_09_Nested_If;
public class _03_Nested_If_Payilagam {
	public static void main(String[] args) {
	 int a = 2;
     int b = 2;
     int c = 56;

     if (a == b) {
         // nested if else condition to check if c is equal to a and b
         if (a == c) {
             // all are equal
             System.out.println("Equal");
         } else {
             // a!=c
             System.out.println("Not equal 1");
         }
     }
     else {
         // a!=b
         System.out.println("Not equal 2");
     }
 }
}