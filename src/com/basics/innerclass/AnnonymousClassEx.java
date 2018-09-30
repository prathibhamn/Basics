package com.basics.innerclass;

import java.util.Comparator;

public class AnnonymousClassEx {

	public static void main(String[] args) {

		Outer.Inner<String> i1 = new Outer.Inner<String>( );
		Outer.OtherInner i2 = new Outer.OtherInner( );
		
		SimpleRectangle[] rects = new SimpleRectangle[4];
		rects[0] = new SimpleRectangle(1, 10);
		rects[1] = new SimpleRectangle(20, 1);
		rects[2] = new SimpleRectangle(4, 6);
		rects[3] = new SimpleRectangle(5, 5);
		System.out.println("MAX WIDTH: " + Utils.findMax(rects, new Comparator<SimpleRectangle>() {
			public int compare(SimpleRectangle r1, SimpleRectangle r2) {
				return r1.getWidth() - r2.getWidth();
			}
		}));
	}

}

class Outer<AnyType> {
	public static class Inner<AnyType> {
	}

	public static class OtherInner {
		// cannot use AnyType here
	}
}