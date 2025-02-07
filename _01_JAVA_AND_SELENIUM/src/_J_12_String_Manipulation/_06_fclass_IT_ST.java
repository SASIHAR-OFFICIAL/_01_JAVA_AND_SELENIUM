package _J_12_String_Manipulation;

public class _06_fclass_IT_ST {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.out.print("Sarathi");
		
		int m1=90;
		int m2=100;
		int M3=m1-m2;
		
		System.out.print("result of mark "+M3);
		
		
String comment=("sarathi is studying but very slowly ");


		String result="vinoth";
		
		System.out.println("kavin "+comment.concat(result));
		
		System.out.println(comment.equals(result));
		
		System.out.println(comment.length());
		
		System.out.println(result.charAt(0));
						
		System.out.println(comment.indexOf("i")); 
		
	 result = new StringBuffer(result).reverse().toString();
		System.out.println(result);

	}


}