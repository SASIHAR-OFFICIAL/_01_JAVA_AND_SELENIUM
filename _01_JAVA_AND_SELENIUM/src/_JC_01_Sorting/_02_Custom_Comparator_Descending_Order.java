package _JC_01_Sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class _02_Custom_Comparator_Descending_Order {

	public static void main(String[] args) {

	      List<Integer> numbers = new ArrayList<>(Arrays.asList(5, 2, 9, 1, 7));

	      //  Collections.sort(numbers, Comparator.naturalOrder()); // Sort in Acceding order
	        Collections.sort(numbers, Comparator.reverseOrder()); // Sort in descending order

	        System.out.println(numbers); // Output: [9, 7, 5, 2, 1]
	    }
	}