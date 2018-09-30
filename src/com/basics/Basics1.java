package com.basics;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Basics1 {
	
	void add(int a)
	{
		
	}

	public static void main (String args[])
	{
		
		
		Map<String, java.lang.Object> collection = new TreeMap<>();
		collection.putIfAbsent("foo", "bar");
		collection.computeIfPresent("foo", (k,v) ->(v==null)? ((List)v).add("bar"):((List)v).add("bar"));
		System.out.println(collection.compute("foo",(k,v) ->(v==null)? new ArrayList<java.lang.Object>():
				((List)v).add("bar")));
		
		
		System.out.println(collection.compute("foo",(k,v) ->(v==null)? new ArrayList<java.lang.Object>():
			((List)v).add("ber")));
		
		System.out.println("......");
	}
	
}
