package _00_Java_EMC;

import java.util.Scanner;

public class _05_Return_SCHOOL2_EMC {

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
		_05_Return_SCHOOL2_EMC obj = new _05_Return_SCHOOL2_EMC();

		String result = obj.Pass_or_Fail(mark);
		System.out.println(result);
	}}
