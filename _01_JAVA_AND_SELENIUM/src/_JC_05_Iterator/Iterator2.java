package _JC_05_Iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Iterator2 {

	public static void main(String[] args) {
		
		 // ArrayList உருவாக்கல்
		
        List<String> names = new ArrayList<>();
        names.add("Arun");
        names.add("Bala");
        names.add("Charan");

        // Iterator உருவாக்குதல்
        
        Iterator<String> iterator = names.iterator();

        // Iterating through the list
        
        while (iterator.hasNext()) {
            String name = iterator.next();
            System.out.println(name);
        }
    }
}