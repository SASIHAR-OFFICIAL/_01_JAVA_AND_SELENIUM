package _J_02_07_00_Expectation_Handling_Try;

public class _01_int_Try_Catch_Finally {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a =10;
int b= 0;
int c = 0;

try {
	System.out.println("C = "+(c=a/b));
} catch (Exception e) {
System.out.println("Exception = "+e);
}
finally {
	System.out.println("Program runed");
}

	}

}
