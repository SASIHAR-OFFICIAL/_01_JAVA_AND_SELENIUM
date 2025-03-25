package _JC_12_Linked_Hash_Set;

import java.util.LinkedHashSet;

public class LinkedHashSetExample {
    public static void main(String[] args) {
        LinkedHashSet<String> set = new LinkedHashSet<>();
        set.add("Banana");
        set.add("Apple");
        set.add("Mango");
        System.out.println(set); // Output: [Banana, Apple, Mango] (insertion order preserved)
    }
}