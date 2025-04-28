package com.map.java;

import java.util.Collection;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Vector;

public class HashMapPractice_01 {

	public static void main(String[] args) {
		
		
		
		Map<Integer,String> m=new Hashtable<>(); 
		
		m.put(1012,"Banana");
		m.put(2120,"Orange");
		m.put(3230,"Gova");
		//m.put(30,"Gova");
		//Retrivel of key from the map
		
		//System.out.println(m.keySet());
		
		/*
		Set<Integer> keys=m.keySet();
		
		for(Integer key:keys) {
			System.out.println(key);
			System.out.println(key+">>>"+m.get(key));
		}
		*/
		
		//Retrieval of values from the map
		Collection<String> value=m.values();
//		System.out.println(value);
		
//		for(String vl:value) {
//			System.out.println(vl);
//		}
		
		//Retrieval of value from the map based on a key
		
		/*
		System.out.println(m.get(2120));
		
		for(Integer key:keys) {
			System.out.println(key+">>>"+m.get(key));
		}
		
		*/
		
	//	System.out.println("======Delete of element from the map====");
		//Delete of element from the map
		
		//m.remove(2120);
		
		System.out.println("====Verification of key in a map===="); 
		
		System.out.println(m.containsKey(3230));
		System.out.println(m.containsKey(320));
		System.out.println("====Verification of value in a map===="); 
		
		System.out.println(m.containsValue("Banana"));
		System.out.println(m.containsValue("Bana"));
		
		System.out.println("====Updation of element in a map===="); 
		m.put(3230, "hyderabad");
		m.putIfAbsent(3230, "hyderabad");
		System.out.println(m);
		
		
	}

}
