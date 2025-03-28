package _JC_15_Hash_Map;

import java.util.HashMap;

public class HashMapExample {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        
        map.put(3, "Orange");
        map.put(1, "Apple");
        map.put(2, "Banana");
        map.put(4, "Banana");
            
        System.out.println(map); // Output: {1=Apple, 2=Banana, 3=Orange}
        System.out.println("-------------------------------------------------");
        
        HashMap<Integer, String> map2 = new HashMap<>();
        map2.put(1, "Apple");
        map2.put(2, "Banana");
        map2.put(3, "Orange");

        System.out.println(map2.get(1)); // Output: Apple
        System.out.println(map2.containsKey(2)); // Output: true
    }
}
