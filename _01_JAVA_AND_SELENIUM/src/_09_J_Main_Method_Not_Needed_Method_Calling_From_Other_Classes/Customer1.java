package _09_J_Main_Method_Not_Needed_Method_Calling_From_Other_Classes;
public class Customer1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Bank1 Manger = new Bank1();
Manger.Enquire();
Manger.deposit();
System.out.println(Manger.InterestRate);
	}
}
