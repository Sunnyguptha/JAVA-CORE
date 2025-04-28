package com.List_Collection.java;
import java.util.*;
public class VectorPractice_02 {
public static void main(String[] args) {
	 
	Object[] arr=new Object[] {1,2,3,6,4};
	Vector v1=new Vector(Arrays.asList(arr));
	v1.add("hyderabad");
	int sum=0;
	
	for(int i=0;i<v1.size();i++)
	{
		//sum+=i;
		//sum+=(Integer)v1.get(i);
	}
	System.out.println(v1);
	System.out.println(v1.size());
	
	
	
	
	/*
	
	Vector v2=new Vector();
	v2.addAll(Arrays.asList(arr));
	//System.out.println(v2);
	
	for(Object o:v2) {
	//	System.out.println(o);
	}
	v2.add("hyderabad");
	int sum=0;
	for(int i=0;i<v2.size();i++)
	{
		//sum+=i;
		sum+=(Integer)v2.get(i);
	}
	//System.out.println(sum);
	//System.out.println(v2);
	//System.out.println(v2.size());
	//System.out.println(v2.capacity());
	
	*/
	
	
}
}
