package com.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Day4 {

	public static void main(String[] args) {
		
		ArrayList<Integer> numbers = new ArrayList<Integer>(Arrays.asList(1, 1,1, 2, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 12, 14, 15, 15, 15, 16, 34, 23));
        
		Set<Integer> store = new HashSet<Integer>();
		
		
		for(Integer e : numbers)
		{
			if(store.add(e)==false)
			{
				System.out.println(e);
			}
			
		}
		
		System.out.println("******************************");
		
		ArrayList<String> names = new ArrayList<String>(Arrays.asList("A","A","B","B","C","D","E","E","F","G","G"));

		Set<String> storename = new HashSet<String>();
		
		for(String e : names)
		{
			if(storename.add(e)==false)
			{
				System.out.println(e);
			}
			
		}
		
		
		
		
		
		
		
		
		

	}

}
