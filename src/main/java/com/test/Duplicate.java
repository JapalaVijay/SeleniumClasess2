package com.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Duplicate {

	public static void main(String[] args) {
		
		ArrayList<Integer> numbers = new ArrayList<Integer>(Arrays.asList(1, 1,1, 2, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 12, 14, 15, 15, 15, 16, 34, 23));
        
		 
		 Set<Integer> store = new HashSet<Integer>();
		
	
		 for(Integer e : numbers) 
		 {
			 if(store.add(e)==false) { 
			 System.out.println(e);
			 }
			 
		 }
		 System.out.println("***************************************");
		 
		 duplicateElementByMap(numbers);
	}
	public static void duplicateElementByMap(ArrayList<Integer> numbers) {

				Map<Integer, Integer> map = new HashMap<Integer, Integer>();
				for (Integer num : numbers) {
					Integer count = map.get(num);

					if (count == null) {
						map.put(num, 1);
					} else {
						map.put(num, ++count);
					}
				}
				System.out.println("duplicate count: " + map);

				Set<Entry<Integer, Integer>> store = map.entrySet();
				for (Entry<Integer, Integer> e : store) {
					if (e.getValue() > 1) {

						System.out.println(e.getKey());
					}

				}
	}
	
}

	




