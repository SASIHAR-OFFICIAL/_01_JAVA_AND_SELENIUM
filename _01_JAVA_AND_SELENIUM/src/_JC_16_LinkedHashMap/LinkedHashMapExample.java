package _JC_16_LinkedHashMap;

import java.util.LinkedHashMap;

public class LinkedHashMapExample {
    public static void main(String[] args) {
    	
    	
        LinkedHashMap map = new LinkedHashMap();
        
        map.put(1, "Red");
        map.put(2, "Green");
        map.put(3, "Blue");
        map.put(4, "Blue");
        
        System.out.println(map); // Output: {1=Red, 2=Green, 3=Blue}
        System.out.println("-------------------------------------------------");

        LinkedHashMap<Integer, String> map2 = new LinkedHashMap<>();
        map2.put(1, "Dog");
        map2.put(2, "Cat");
        map2.put(3, "Rabbit");

        System.out.println(map2); // Output: {1=Dog, 2=Cat, 3=Rabbit}
        
        
        
    }
}