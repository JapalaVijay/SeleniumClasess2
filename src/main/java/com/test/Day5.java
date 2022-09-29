package com.test;

import java.util.HashMap;
import java.util.Map;

public class Day5 {


     public static void getduplicateLetter(String name) {
		
		char[] ch = name.toCharArray();
		
		Map<Character,Integer> map = new HashMap<Character,Integer>();
			for(char e : ch) {
			
				if(map.containsKey(e)) {
					int count = map.get(e);	
					map.put(e, ++count);
				}else {
					map.put(e, 1);
				}
			}
			for(char e : map.keySet() ) {
				if(map.get(e)==1 && !Character.isWhitespace(e)) {
					System.out.println(e);
				}
		
	}
	}
	
	public static void main(String[] args) {

		String dup = "mamatha"; 
		getduplicateLetter(dup);
	}

}
