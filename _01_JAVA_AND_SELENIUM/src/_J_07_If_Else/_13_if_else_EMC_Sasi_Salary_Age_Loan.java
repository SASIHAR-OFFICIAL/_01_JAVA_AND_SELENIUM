package _J_07_If_Else;

import java.util.Scanner;

public class _13_if_else_EMC_Sasi_Salary_Age_Loan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// creates an object of Scanner
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter your Salary: ");
		int Salary_Typed = scan.nextInt();
		System.out.print("Enter your Age: ");	
		int Age_Typed  = scan.nextInt();

		if (Salary_Typed>20000 && (Age_Typed>25)) {
			System.out.println("Enter Required Loan Amount");
			{int Loan_Amount = scan.nextInt();
			if (Loan_Amount <=50000) {
				System.out.println("Your are Eligible");
			}
			else {
				System.out.println("Maximum Loan Amount is Rs.50,000");
			}}
		}
		else {
			System.out.println("Loan Not Eligible");
		}}}