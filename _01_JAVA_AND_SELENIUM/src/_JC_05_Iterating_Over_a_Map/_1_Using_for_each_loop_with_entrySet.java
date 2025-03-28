package _JC_05_Iterating_Over_a_Map;

import java.util.HashMap;
import java.util.Map;

public class _1_Using_for_each_loop_with_entrySet {
	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<>();
		map.put(1, "Apple");
		map.put(2, "Banana");
		//  1. Using for-each loop with entrySet()
	
		for (Map.Entry<Integer, String> entry : map.entrySet()) {
			System.out.println(entry.getKey() + " -> " + entry.getValue());

		

				}
			}
		}
	
