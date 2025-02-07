package _J_07_If_Else;

public class _01_If_Else_03_Payilagam {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double n1 = -4.5, n2 = 3.9, n3 = 12.5;

        if( n1 >= n2 && n1 >= n3)
            System.out.println(n1 + " is the largest number.");

        else if (n2 >= n1 && n2 >= n3)
            System.out.println(n2 + " is the largest number.");

        else
            System.out.println(n3 + " is the largest number.");
    }
}