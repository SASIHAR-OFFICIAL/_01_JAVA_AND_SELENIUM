package _JC_05_Iterator;

import java.util.*;

public class Using_Iterator_remove_Method {
	public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(Arrays.asList(10, 20, 30, 40));

        // Iterator உருவாக்கல்
        Iterator<Integer> iterator = numbers.iterator();

        while (iterator.hasNext()) {
            int num = iterator.next();
            if (num == 30) {
                iterator.remove(); // 30 ஐ நீக்குதல்
            }
        }

        System.out.println(numbers); // [10, 20, 40]
    }
}