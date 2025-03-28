package _JC_18_Hash_Table;
import java.util.HashMap;
import java.util.Hashtable;
public class HashtableExample {
	public static void main(String[] args) {
		
		Hashtable<Integer, String> hashtable = new Hashtable<>();
        hashtable.put(3, "Apple");
        hashtable.put(1, "Banana");
        hashtable.put(2, "Cherry");
        System.out.println("Hashtable: " + hashtable); // Random order
        
        System.out.println("-------------------------------------------------");

        HashMap<Integer, String> HashMap = new HashMap<>();
        HashMap.put(3, "Apple");
        HashMap.put(1, "Banana");
        HashMap.put(2, "Cherry");
        System.out.println("HashMap: " + HashMap); 
        System.out.println("-------------------------------------------------");

        Hashtable<Integer, String> map = new Hashtable<>();
        map.put(1, "John");
        map.put(2, "Doe");

        System.out.println(map.get(1)); // Output: John
	}
}
