package com.iterator.java;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.Vector;

public class Iterrator_01 {

	public static void main(String[] args) {
		List<String> l1=new ArrayList<>();
		l1.add("Banana");
		l1.add("Orange");
		l1.add("Apple");
		l1.add(null);
		l1.add(null);
		l1.add("Apple");
		
		
		Iterator<String> i1=l1.iterator();
		
		while(i1.hasNext()) {
			System.out.println(i1.next());
		}
		System.out.println();
		System.out.println("==========LinkedList=============");
		List<String> l2=new LinkedList<>();
		l2.add("Cat");
		l2.add("Dog");
		l2.add("Horse");
		
		Iterator<String> i2=l2.iterator();
		while(i2.hasNext()) {
			System.out.println(i2.next());
		}
		
		System.out.println();
		System.out.println("==========Vector=============");
		
		Vector<String> l3=new Vector<>();
		l3.add("Hyderabad");
		l3.add("Warangle");
		l3.add("Hasanparty");
		l3.add(null);
		l3.add(null);
		l3.add("Hasanparty");
		
		Iterator<String> i3=l3.iterator();
		while(i3.hasNext()) {
			String str=i3.next();
			System.out.println(str);
		}
		
		System.out.println();
		System.out.println("==========Stack=============");
		
		Stack<String> l4=new Stack<>();
		l4.add("Uppal");
		l4.add(null);
		l4.add("uppal");
		l4.add("sr nagar");
		l4.add(null);
		l4.add("taranak");
		
		Iterator i4=l4.iterator();
		while(i4.hasNext()) {
			System.out.println(i4.next());
		}
		
		System.out.println();
		System.out.println("==========Set=============");
		
		
		
		
		
		
	}

}
