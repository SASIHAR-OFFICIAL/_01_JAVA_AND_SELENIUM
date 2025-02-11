package _10_J_ENCAPSULATION_Default_02;

public class Farm_Owner_Son extends Farm_Owner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Farm_Owner_Son Farm_Owner_Son_obj1 = new Farm_Owner_Son();
		Farm_Owner_Son_obj1.Pick_fruits();
		Farm_Owner_Son_obj1.Plough_Flowers();
		int Fruit_Price_Son =Farm_Owner_Son_obj1.Fruit_Price_Son;
		System.out.println("Price of Fruit for Son = "+Fruit_Price_Son);
	}

}
