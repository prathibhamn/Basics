package com.basics.generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class GenericsEX3 {
	public static <T extends Integer> void main(String[] args) {
		List<String> ls = new ArrayList<>(); // 1
		List<java.lang.Object> lo = new ArrayList<>(); // 2
		lo.add(new java.lang.Object()); // 3
		// String s = (String) lo.get(0);
		// System.out.println(s);
		Collection<? extends java.lang.Object> c = new ArrayList<String>();
		// Set<String>[] lObj= new HashSet<String>()[];
		// c.add(new Object());

		// T[] abc = new T[10];
		// T a = new T();
		int[] ab= new int[3];
		ab[0]=2;
		ab[1]=2;
		ab[2]=2;
		/* ArrayList<String> [ ] arr1 = new ArrayList<String>[ 10 ]; */
		ArrayList<String> arr1 = new ArrayList<String>();
		List<Integer> lInt = Arrays.asList(45,34);
		java.lang.Object[] arr2 = new java.lang.Object[20];
		arr2[0]=lInt;
		arr2[1]=ab;
		arr2[2]=23;
		//arr2[0] = new ArrayList<Double>();

		Set<java.lang.Object> setOfAnyType = new HashSet<java.lang.Object>();
		setOfAnyType.add("abc"); // legal
		setOfAnyType.add(new Float(3.0f));
		List<? super Integer> basket = new ArrayList<>();
		basket.add(3);
		// basket.add((int) 3l);
		Number bc = new Number() {

			@Override
			public long longValue() {
				// TODO Auto-generated method stub
				return 0;
			}

			@Override
			public int intValue() {
				// TODO Auto-generated method stub
				return 0;
			}

			@Override
			public float floatValue() {
				// TODO Auto-generated method stub
				return 0;
			}

			@Override
			public double doubleValue() {
				// TODO Auto-generated method stub
				return 0;
			}
		};

	}
}
