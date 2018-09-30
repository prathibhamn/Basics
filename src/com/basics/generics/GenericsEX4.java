package com.basics.generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class GenericsEX4 {

	public static void main(String[] args) {
		Object[] objectArray = new Long[3];
		Object[] objectArray2 = new String[3];
		objectArray[0] =2l;
		objectArray2=objectArray;
		System.out.println(Arrays.toString(objectArray2));
		objectArray[0] =3l;
		System.out.println(Arrays.toString(objectArray2));
		objectArray2[0] =4l;
		System.out.println(Arrays.toString(objectArray2));
		List<String> strings = new ArrayList<>();
		unsafeAdd(strings,42);
		//String s = strings.get(0); // Compiler-generated cast
		Collection<?> l = new HashSet<>();
		if(l instanceof Set)
		{
			System.out.println("set instance");
		}
		
		int[] b = new int[] {2,3};
		System.out.println(b.toString());
		System.out.println(Arrays.asList(b));
		//List<String>[] abc = new ArrayList<String>[1];
	}

	
	private static void unsafeAdd(List list, Object o) {
		list.add(o);
	}

	// unsafeAdd(List<Object>,Object) cannot be applied to (List<String>,Integer)
	/*
	 * private static void unsafeAdd(List<Object> list, Object o) { list.add(o); }
	 */

	// Parameterized type
	private static void safeAdd(List<String> list, String s) {
		list.add(s);
	}

	// Generic method
	private static <E> void safeAdd(List<E> list, E e) {
		list.add(e);
	}

	// Two possible declarations for the swap method
	public static <E> void swap(List<E> list, int i, int j) {
	}

	/*public static void swap(List<?> list, int i, int j) {
		//swapHelper(list, i, j);
	}*/
}
