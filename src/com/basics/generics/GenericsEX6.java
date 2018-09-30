package com.basics.generics;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.function.Function;

public class GenericsEX6 {

	public static void main(String[] args) {
		Set<Integer> lInt = new HashSet<>(2);

		lInt.add(3);
		lInt.add(4);
		lInt.add(5);
		lInt.add(6);
		Set<Double> lDouble = new HashSet<>(4);
		lInt.add(7);
		lInt.add(8);
		lInt.add(9);
		lInt.add(10);
		Set<Number> lNum = union(lInt, lDouble);
		System.out.println(lNum);
	}

	static <E> E reduce(List<E> list, Function<E, E> f, E initVal) {

		// Old way
		E[] snapShot = (E[]) list.toArray();

		E result = initVal;
		for (E e : snapShot)
			result = f.apply(e);

		// new Way
		List<E> snapshot1;
		synchronized (list) {
			snapshot1 = new ArrayList<>(list);
		}
		result = initVal;
		for (E e : snapshot1)
			result = f.apply(e);
		return result;
	}

	public static <E> Set<E> union(Set<? extends E> s1, Set<? extends E> s2)

	{
		Set<E> result = new HashSet<>(s1);
		result.addAll(s2);
		return result;
	}

	public static <T extends Comparable<? super T>> T max(List<? extends T> lst) {
		Iterator<? extends T> l = lst.iterator();
		T result = l.next();
		while (l.hasNext()) {

			T t = l.next();
			if (t.compareTo(result) > 0) {
				result = t;
			}
		}
		return result;
	}

	public static <AnyType extends Comparable<? super AnyType>> AnyType findMax(AnyType[] a) {
		int maxIndex = 0;

		for (int i = 1; i < a.length; i++) {
			if (a[i].compareTo(a[maxIndex]) > 0)
				maxIndex = i;

		}
		return a[maxIndex];
	}

	public static void swap(List<?> lst, int i, int j) {

		swapHelper(lst, i, j);

	}

	private static <E> void swapHelper(List<E> lst, int i, int j) {
		lst.set(i, lst.set(j, lst.get(i)));
	}
}
