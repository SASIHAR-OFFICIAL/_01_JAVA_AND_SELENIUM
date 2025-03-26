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
    }
}