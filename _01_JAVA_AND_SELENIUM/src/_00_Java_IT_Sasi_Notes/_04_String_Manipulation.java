package _00_Java_IT_Sasi_Notes;

public class _04_String_Manipulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hai");
		String comment ="Tamil";
		String result ="Truth and Truth";
		System.out.println(comment.concat(result));
		System.out.println(comment.length());
		System.out.println(comment.concat(result));
		System.out.println(comment.charAt(3));
		System.out.println(comment.concat(result));
		System.out.println(result.indexOf("and"));
		comment = new StringBuffer(result).reverse().toString();
		System.out.println(comment);
		System.out.println(comment.equals(result));

	}

}
