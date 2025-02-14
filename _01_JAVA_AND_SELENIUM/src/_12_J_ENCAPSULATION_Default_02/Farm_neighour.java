package _12_J_ENCAPSULATION_Default_02;

public class Farm_neighour {

	public static void main(String[] args) {

		Farm_Owner Farm_Owner_obj = new Farm_Owner();
		
		Farm_Owner_obj.Pick_fruits();
		Farm_Owner_obj.Plough_Flowers();
		int Fruit_Price_neighour =Farm_Owner_obj.Fruit_Price_neighour;
		System.out.println("Price of Fruit = "+Fruit_Price_neighour);
	}
}
