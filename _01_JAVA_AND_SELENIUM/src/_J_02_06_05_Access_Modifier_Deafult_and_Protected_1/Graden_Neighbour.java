package _J_02_06_05_Access_Modifier_Deafult_and_Protected_1;

public class Graden_Neighbour {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Garden_Owner Garden_Owner_object = new Garden_Owner();
		
		Garden_Owner_object.Plough_Flowers();
		Garden_Owner_object.Pick_fruits();
		
		int fruit_Price = Garden_Owner_object.Fruit_Price;
		System.out.println(fruit_Price);
	}

}
