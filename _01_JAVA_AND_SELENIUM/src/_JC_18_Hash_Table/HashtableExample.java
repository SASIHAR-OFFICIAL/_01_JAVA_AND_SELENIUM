package _JC_18_Hash_Table;
import java.util.Hashtable;
public class HashtableExample {
	public static void main(String[] args) {
		
		Hashtable<Integer, String> hashtable = new Hashtable<>();
        hashtable.put(3, "Apple");
        hashtable.put(1, "Banana");
        hashtable.put(2, "Cherry");
        System.out.println("Hashtable: " + hashtable); // Random order
	}
}
