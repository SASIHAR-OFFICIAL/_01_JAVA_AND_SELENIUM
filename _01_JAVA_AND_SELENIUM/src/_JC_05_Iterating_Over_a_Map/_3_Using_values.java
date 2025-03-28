package _JC_05_Iterating_Over_a_Map;

import java.util.HashMap;
import java.util.Map;

public class _3_Using_values {
	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<>();
		map.put(1, "Apple");
		map.put(2, "Banana");
		

				//3. Using values()-----------------------------------------------------------
			
				for (String value : map.values()) {
				    System.out.println(value);
				}
			}
		
	}
