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
    }
}
