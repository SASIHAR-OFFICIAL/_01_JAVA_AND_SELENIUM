package _JC_13_01_Tree_Set_Sorted_Set;

import java.util.TreeSet;
public class TreeSetExample {
    public static void main(String[] args) {
        TreeSet<String> set = new TreeSet<>();
        set.add("Banana");
        set.add("Apple");
        set.add("Orange");
        set.add("Mango");
        
        System.out.println(set);  // Output will be sorted: [Apple, Banana, Mango, Orange]
    }
}