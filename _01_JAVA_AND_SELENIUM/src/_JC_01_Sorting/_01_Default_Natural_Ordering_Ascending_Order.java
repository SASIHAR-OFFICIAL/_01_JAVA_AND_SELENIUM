package _JC_01_Sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class _01_Default_Natural_Ordering_Ascending_Order {

	public static void main(String[] args) {

		List<Integer> numbers = new ArrayList<>(Arrays.asList(5, 2, 9, 1, 7));

        Collections.sort(numbers); // Sorts in natural order (ascending)

        System.out.println(numbers); // Output: [1, 2, 5, 7, 9]
    }
}