package _JC_03_Compare;

import java.util.Arrays;
import java.util.List;

public class Comparing_Lists_Order_Matters {

	public static void main(String[] args) {
		 List<String> list1 = Arrays.asList("A", "B", "C");
	        List<String> list2 = Arrays.asList("A", "B", "C");
	        List<String> list3 = Arrays.asList("C", "B", "A");

	        System.out.println(list1.equals(list2)); // true
	        System.out.println(list1.equals(list3)); // false (Order matters)
	    }
	}

