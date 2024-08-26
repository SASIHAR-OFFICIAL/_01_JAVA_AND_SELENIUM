package _J_12_String_Manipulation;

public class _07_stringclass_IT_ST {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				int a;
			a=10;
			int b=30;
			System.out.println(a);
			char c='g';
		String comment="Truth one";
		String result=("Truth one");
		
		System.out.println("clup up: "+comment.concat(result));
		
		
	System.out.println(comment.equals(result));
		
		System.out.println(comment.length());
		System.out.println(comment.charAt(4));
		System.out.println(comment.indexOf("e"));
		
	 result = new StringBuffer(result).reverse().toString();
	System.out.println(result);

	}

}
