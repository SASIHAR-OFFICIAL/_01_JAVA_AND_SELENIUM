package _JC_05_Iterating_Over_a_Map;

import java.util.HashMap;
import java.util.Map;

public class _4_Using_Java_8_forEach {
	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<>();
		map.put(1, "Apple");
		map.put(2, "Banana");
	
	
		map.forEach((key, value) -> System.out.println(key + " -> " + value));

		

				}
			}
		
	
