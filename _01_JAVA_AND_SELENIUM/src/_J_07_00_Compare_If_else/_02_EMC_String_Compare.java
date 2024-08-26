package _J_07_00_Compare_If_else;

public class _02_EMC_String_Compare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String fruit1 = new String("apple");
		String fruit2 = new String("apple");

		String fruit3 = "apple";
		String fruit4 = "apple";

		System.out.println(fruit1==fruit2);  // COMPARE ADDRESS ONLY THAT MEANS VARIABLE NAME
		System.out.println(fruit1.equals(fruit2)); // CHECK THE INNER CONTENT
		System.out.println(fruit3==fruit4);

	}}
