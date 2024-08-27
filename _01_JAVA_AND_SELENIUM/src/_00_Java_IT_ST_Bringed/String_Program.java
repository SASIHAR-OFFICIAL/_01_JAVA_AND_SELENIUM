package _00_Java_IT_ST_Bringed;


public class String_Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			/*System.out.println("sarathi");
			int a;
			a=10;
			System.out.println(a);
			int b=20;
			char c='g';
			String s=new String("Web Services in API Process");*/
			
			String comment=("this is true ");
			
			String result="Truth triumph";
			
			String result1="truth triumph";
			
			
			System.out.println("clup up "+comment.concat(result));
			
			System.out.println(result.equals(result1));
			System.out.println(comment.length());
			System.out.println(comment.charAt(3));
			System.out.println(comment.indexOf("true")); 
			
			String revresult = new StringBuffer(result).reverse().toString();
			System.out.println(revresult);


		}

	}


