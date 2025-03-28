package _JC_05_Iterating_Over_a_Map;

import java.util.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class _00_RemoveExample {

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
	


