package _JC_14_MapComparison;

import java.util.*;

public class MapComparison {
    public static void main(String[] args) {
        // HashMap: No ordering
        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(3, "Apple");
        hashMap.put(1, "Banana");
        hashMap.put(2, "Cherry");
        System.out.println("HashMap:        " + hashMap); // Random order

        // LinkedHashMap: Maintains insertion order
        LinkedHashMap<Integer, String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put(3, "Apple");
        linkedHashMap.put(1, "Banana");
        linkedHashMap.put(2, "Cherry");
        System.out.println("LinkedHashMap:  " + linkedHashMap); // Insertion order

        // TreeMap: Sorts keys in natural order
        TreeMap<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(3, "Apple");
        treeMap.put(1, "Banana");
        treeMap.put(2, "Cherry");
        System.out.println("TreeMap:        " + treeMap); // Sorted order

        // Hashtable: Thread-safe, no null keys/values
        Hashtable<Integer, String> hashtable = new Hashtable<>();
        hashtable.put(3, "Apple");
        hashtable.put(1, "Banana");
        hashtable.put(2, "Cherry");
        System.out.println("Hashtable:      " + hashtable); // Random order

        // Hashtable doesn't allow null keys or values
        // hashtable.put(null, "NullKey"); // Throws NullPointerException
        // hashtable.put(4, null); // Throws NullPointerException
        
        // -------OUTPUT--------------------
//        HashMap: {1=Banana, 2=Cherry, 3=Apple}
//        LinkedHashMap: {3=Apple, 1=Banana, 2=Cherry}
//        TreeMap: {1=Banana, 2=Cherry, 3=Apple}
//        Hashtable: {3=Apple, 1=Banana, 2=Cherry}
        
    }
}