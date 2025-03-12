package _JC_03_Compare;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Comparing_Lists_Ignoring_Order {

	public static void main(String[] args) {

	     List<String> list1 = new ArrayList<>(Arrays.asList("A", "B", "C"));
	        List<String> list2 = new ArrayList<>(Arrays.asList("C", "B", "A"));

	        Collections.sort(list1);
	        Collections.sort(list2);

	        System.out.println(list1.equals(list2)); // true
	    }
	}