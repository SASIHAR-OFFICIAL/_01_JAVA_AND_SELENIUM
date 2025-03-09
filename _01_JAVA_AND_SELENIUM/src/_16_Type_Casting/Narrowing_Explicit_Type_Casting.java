package _16_Type_Casting;

//Requires manual casting using parentheses ().
//Converts a larger data type to a smaller data type.
//May cause data loss if the value cannot fit in the smaller type.

public class Narrowing_Explicit_Type_Casting {

	public static void main(String[] args) {

		 double doubleNum = 10.99;
	        int intNum = (int) doubleNum; // Explicit casting from double to int

	        System.out.println("Double: " + doubleNum);
	        System.out.println("Integer: " + intNum);
	    }
	}