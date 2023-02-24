package com;

import java.util.HashMap;
import java.util.Map;

 public class Hashmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Jeevith is good boy and he is very naughty boy";
		Map<String,Integer> hashmap = new HashMap<String,Integer>();
		String[] text = str.split(" ");
		for(String word : text) {
		
		Integer integer = hashmap.get(word);
		if(integer == null) 
			hashmap.put(word, 1);
			else {
				hashmap.put(word,  integer+ 1);
				
			}
		}
		System.out.println(hashmap);
		
		
	}

}
