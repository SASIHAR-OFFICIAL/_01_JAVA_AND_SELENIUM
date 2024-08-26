package _J_02_06_Return_Function_Payilagam;

import java.util.Scanner;

public class _02_SCHOOL2_EMC {

	String Pass_or_Fail(int score) {

		if (score >=35) {
			return "Pass";
		}
		else {
			return "Fail";
		}}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Total Mark = ");
		int mark = scan.nextInt();
		_02_SCHOOL2_EMC obj = new _02_SCHOOL2_EMC();

		String result = obj.Pass_or_Fail(mark);
		System.out.println(result);
	}}
