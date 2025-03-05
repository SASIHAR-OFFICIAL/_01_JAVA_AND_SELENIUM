package _JC_42_Array_List;

import java.util.ArrayList;
import java.util.List;

public class ArrayList1 {

	public static void main(String[] args) {

		ArrayList AL1 = new ArrayList();
		AL1.add(01);
		AL1.add(03);
		AL1.add("sasi");
		AL1.add("jaya");
		AL1.add("wife");
		AL1.add(5, "19");  // It add object in particular index
		System.out.println(AL1);
		System.out.println(AL1.add(16)); // It give true because it adds 16 to list
		System.out.println(AL1); // I gives list with added 16
		AL1.remove(4);
		System.out.println(AL1);
		System.out.println(AL1.get(2));
		AL1.remove("19");
		System.out.println(AL1);
		AL1.set(4, "61");
		System.out.println(AL1);

		System.out.println(	AL1.indexOf("s;asi"));
		//-------------------------------------------
		ArrayList AL2 = new ArrayList();
		AL2.addAll(AL1);
		System.out.println(AL2);
		List AL3 = AL2.subList(0, 3);
		System.out.println(AL3);

	}

}
