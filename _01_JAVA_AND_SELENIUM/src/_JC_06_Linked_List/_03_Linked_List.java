package _JC_06_Linked_List;

import java.util.LinkedList;
import java.util.List;

public class _03_Linked_List {

	public static void main(String[] args) {
		List<String> linkedList = new LinkedList<>();
		linkedList.add("X");
		linkedList.add("Y");
		linkedList.addFirst("Z");
		System.out.println(linkedList); // Output: [Z, X, Y]

	}

}
