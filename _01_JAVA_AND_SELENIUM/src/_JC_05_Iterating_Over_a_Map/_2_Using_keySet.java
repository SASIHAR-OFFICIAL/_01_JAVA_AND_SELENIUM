package _JC_05_Iterating_Over_a_Map;

import java.util.HashMap;
import java.util.Map;

public class _2_Using_keySet {
	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<>();
		map.put(1, "Apple");
		map.put(2, "Banana");
	

			//2. Using keySet()---------------------------------------------------------------
		
			for (Integer key : map.keySet()) {
				System.out.println(key + " -> " + map.get(key));

			
				}
			}
		}
	
