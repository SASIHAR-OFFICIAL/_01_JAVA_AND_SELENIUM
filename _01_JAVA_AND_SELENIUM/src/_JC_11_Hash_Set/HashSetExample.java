package _JC_11_Hash_Set;

import java.util.HashSet;
public class HashSetExample {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("Banana");
        set.add("Apple");
        set.add("Orange");
        set.add("Mango");
        
        System.out.println(set);  // Order is not guaranteed
    }
}