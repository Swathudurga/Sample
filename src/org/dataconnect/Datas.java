package org.dataconnect;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;

import com.google.common.collect.Multiset.Entry;

public class Datas extends DatabaseJDBC {
   
	public static void main(String[] args) {
	String s="Java123! Welcom 63 program#75";
	System.out.println(s);
	String[] words = s.split(s);
	Map<String,Integer> map=new LinkedHashMap<>();
	for (String w : words) {
		//System.out.println(w);
		if (map.containsKey(w)) {
			Integer count = map.get(w);
			map.put(w, count+1);
			
		} else {
			map.put(w, 1);
			

		}
		
	}
	System.out.println(map);
	System.out.println();
	
//	Set<Entry<String,Integer>> x=map.entrySet();
//	for (Entry<String,Integer> each : x) {
//		System.out.println(each);
		
	}
	
			

	}
	
		
	
		
	


