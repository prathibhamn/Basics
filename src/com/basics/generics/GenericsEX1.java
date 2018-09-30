package com.basics.generics;

import java.util.ArrayList;
import java.util.List;

import com.basics.inheritance.Shape;

public class GenericsEX1 {
	
	public static void main(String[] args) {
		List<?> anyObjects = null;
		List<Integer> integers = new ArrayList<Integer>();
		anyObjects = integers;
		List<Double> doubles = new ArrayList<Double>();
		anyObjects = doubles;
		
		//anyObjects.add(new Integer(1)); // Wont compile
		//anyObjects.add(new Double(1.0)); // Wont compile
		anyObjects.add(null); // This will compile.
		integers.add(new Integer(1)); 
		
	}

	public static double totalArea(ArrayList<? extends Shape> arr) {
		double total = 0;

		for (Shape s : arr)
			if (s != null)
				total += s.area();

		return total;
	}

	public static <AnyType> boolean contains(AnyType[] arr, AnyType x) {
		for (AnyType val : arr)
			if (x.equals(val))
				return true;

		return false;
	}

	public static <AnyType extends Comparable<? super AnyType>> AnyType findMax(AnyType[] a) {
		int maxIndex = 0;

		for (int i = 1; i < a.length; i++)
			if (a[i].compareTo(a[maxIndex]) > 0)
				maxIndex = i;

		return a[maxIndex];
	}
}
