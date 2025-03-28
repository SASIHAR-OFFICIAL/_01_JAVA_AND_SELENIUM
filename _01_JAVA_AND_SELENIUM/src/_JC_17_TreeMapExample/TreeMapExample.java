package _JC_17_TreeMapExample;

import java.util.TreeMap;

public class TreeMapExample {
    public static void main(String[] args) {
        TreeMap<Integer, String> map = new TreeMap<>();
        
        map.put(3, "C");
        map.put(1, "A");
        map.put(2, "B");
        map.put(4, "A");
        
        System.out.println(map); // Output: {1=A, 2=B, 3=C}
        
        
        System.out.println("-------------------------------------------------");

        TreeMap<Integer, String> map2 = new TreeMap<>();
        map2.put(3, "Blue");
        map2.put(1, "Red");
        map2.put(2, "Green");

        System.out.println(map2); // Output: {1=Red, 2=Green, 3=Blue}
    }
}