package _JC_05_Iterating_Over_a_Map;

import java.util.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class _00_Iterator2 {

	public static void main(String[] args) {
		
		 // ArrayList உருவாக்கல்
		
        List names = new ArrayList();
        names.add("Arun");
        names.add("Bala");
        names.add("Charan");

        // Iterator உருவாக்குதல்
        
        Iterator iterator = names.iterator();

        // Iterating through the list
        
        while (iterator.hasNext()) {
            String name = (String) iterator.next();
            System.out.println(name);
        }
    }
}