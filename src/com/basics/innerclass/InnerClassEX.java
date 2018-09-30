package com.basics.innerclass;

import java.util.Comparator;

public class InnerClassEX {

	private static class OrderRectByWidth implements Comparator<SimpleRectangle> {
		public int compare(SimpleRectangle r1, SimpleRectangle r2) {
			int  a =9;
			return r1.getWidth() - r2.getWidth();
		}
	}

	public static void main(String[] args) {
		SimpleRectangle[] rects = new SimpleRectangle[4];
		rects[0] = new SimpleRectangle(1, 10);
		rects[1] = new SimpleRectangle(20, 1);
		rects[2] = new SimpleRectangle(4, 6);
		rects[3] = new SimpleRectangle(5, 5);

		System.out.println("MAX WIDTH: " + Utils.findMax(rects, new OrderRectByWidth()));
	}
}

// A simple rectangle class.
class SimpleRectangle {
	public SimpleRectangle(int len, int wid) {
		length = len;
		width = wid;
	}

	public int getLength() {
		return length;
	}

	public int getWidth() {
		return width;
	}

	public String toString() {
		return "Rectangle " + getLength() + " by " + getWidth();
	}

	private int length;
	private int width;
}

class Utils {

	public static <AnyType> AnyType findMax(AnyType[] a, Comparator<? super AnyType> cmp) {
		int maxIndex = 0;

		for (int i = 1; i < a.length; i++)
			if (cmp.compare(a[i], a[maxIndex]) > 0)
				maxIndex = i;

		return a[maxIndex];
	}
}