package com.basics.innerclass;

import java.util.Comparator;

public class LocalClassEx {

	int b = 40;
	static {
		System.err.println("ok...wts.static.up");
	}

	{
		System.err.println("ok...wts..up");
	}
	public static void main(String[] args) {

		LocalClassEx bx = new LocalClassEx();
		
		SimpleRectangle[] rects = new SimpleRectangle[4];
		rects[0] = new SimpleRectangle(1, 10);
		rects[1] = new SimpleRectangle(20, 1);
		rects[2] = new SimpleRectangle(4, 6);
		rects[3] = new SimpleRectangle(5, 5);

		class OrderRectByWidth implements Comparator<SimpleRectangle> {
			int a = 10;

			public int compare(SimpleRectangle r1, SimpleRectangle r2) {
				LocalClassEx bx = new LocalClassEx();
				a = 24;
				b = 34;
				System.out.println(a);
				System.out.println(b);
				System.out.println(bx.b);
				return r1.getWidth() - r2.getWidth();
			}

			int b = 10;
		}

		System.out.println("MAX WIDTH: " + Utils.findMax(rects, new OrderRectByWidth()));

	}
	
	/*public OrderRectByWidth getLocalClassInstance()
	{
		
	}*/
}

class MyOuter2 {
	private String x = "Outer2";
	LocalClassEx lClss = new LocalClassEx();
	
	void doStuff() {
		String z = "local variable";
		class MyInner {
			public void seeOuter() {
				System.out.println("Outer x is " + x);
				System.out.println("Local variable z is " + z); // Won't Compile!
			} // close inner class method
		} // close inner class definition
	} // close outer class method doStuff()
}