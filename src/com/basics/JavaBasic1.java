package com.basics;

public class JavaBasic1 {

	Basics1 b = new Basics1();

	public void add() {
		 String abc = null;
		b.add(2);
	}

	public static void main(String[] args) {
		CharSequence cs = null;
		char c = '\u0000';

		// int i =(Integer) null;

		// byte b = (Byte) null;
		// long l = (Long) null;
		// double d = (Double) null;
		// float f = (Float) null;
		int x7 = 0x52;

		int x = 6;
		int y = 10;
		double div = x / y;

		
		System.out.println("- 55 in base 2: " + Integer.toUnsignedString(-55, 2));
		System.out.println("55 in base 2: " + Integer.toUnsignedString(55, 2));
		System.out.println("55 in base 8: " + Integer.toUnsignedString(-55, 8));
		System.out.println("55 in base default radix 10: " + Integer.toUnsignedString(55));
		System.out.println("- 55 in base default radix 10: " + Integer.toUnsignedString(-55));
		System.out.println("55 in base 6: " + Integer.toUnsignedString(55, 6));
		// System.out.println(" val "+String.valueOf(c) );
		div = (double) x / y;
		// System.out.println(" val "+div);
		String a;
		a = "a" + 1 + 2;// Generates "a12"
		System.out.println(a);
		a = 1 + 2 + "a"; // Generates "3a"
		System.out.println(a);
		a = 1 + (2 + "a");
		System.out.println(a);
		System.out.println("a"+1+2/7);

	}
}
