package com.basic.javaconversion;

/**
 * 1. Primitive Widening > Boxing > Varargs. 2. Widening and Boxing (WB) not
 * allowed. 3. Boxing and Widening (BW) allowed. 4. While overloading, Widening
 * + vararg and Boxing + vararg can only be used in a mutually exclusive manner
 * i.e. not together. 5. Widening between wrapper classes not allowed
 * 
 * Overloaded methods Invoked by saying Called method doX(Integer i) & doX(long
 * l) doX(5) long (by Rule 1) doX(int...i) & doX(Integer i) doX(5) Integer (by
 * Rule 1) doX(Long l) & doX(int...i) doX(5) int...i (Rule 2 & 1) doX(Long l) &
 * doX(Integer...i) doX(5) Integer...i(R. 2&1) doX(Object o) & doX(Long l)
 * doX(5) Object o (Rule 2&3) doX(Object o) & doX(int...i) doX(5) Object o (Rule
 * 3&1) doX(Object o) & doX(long l) doX(5) long l (Rule 3&1) doX(long...l) &
 * doX(Integer...i) doX(5) ambiguous (Rule 4) doX(long...l) & doX(Integer i)
 * doX(5) Integer (Rule 1) doX(Long l) Integer i; error (Rule 5) doX(i) doX(Long
 * l) & doX(long...l) Integer i; long...l(Rule 5 & 1)
 * 
 * 
 * The first phase (§15.12.2.2) performs overload resolution without permitting
 * boxing or unboxing conversion, or the use of variable arity method
 * invocation. If no applicable method is found during this phase then
 * processing continues to the second phase. This guarantees that any calls that
 * were valid in the Java programming language before Java SE 5.0 are not
 * considered ambiguous as the result of the introduction of variable arity
 * methods, implicit boxing and/or unboxing. However, the declaration of a
 * variable arity method (§8.4.1) can change the method chosen for a given
 * method method invocation expression, because a variable arity method is
 * treated as a fixed arity method in the first phase. For example, declaring
 * m(Object...) in a class which already declares m(Object) causes m(Object) to
 * no longer be chosen for some invocation expressions (such as m(null)), as
 * m(Object[]) is more specific.
 * 
 * The second phase (§15.12.2.3) performs overload resolution while allowing
 * boxing and unboxing, but still precludes the use of variable arity method
 * invocation. If no applicable method is found during this phase then
 * processing continues to the third phase. This ensures that a method is never
 * chosen through variable arity method invocation if it is applicable through
 * fixed arity method invocation.
 * 
 * The third phase (§15.12.2.4) allows overloading to be combined with variable
 * arity methods, boxing, and unboxing.
 * 
 * 
 * 
 * 
 * 
 * @author MN.Prathibha
 *
 */

class OverloadedMethod {
	public void test(java.lang.Object obj) {
		System.out.println("Object");
	}

	public void test(java.lang.Object... obj) {
		System.out.println("Object var args");
	}

	/*public void test(char[] a, char[] b) {
		System.out.println("char 2 input");
	}*/

	/*public void test(char[] obj) {
		System.out.println("Char");
	}*/
/*
	public void test(Integer obj) {
		System.out.println("Int");
	}*/

}

public class WideningPrimitiveCon {
	public static void main(String[] args) {

		OverloadedMethod obj = new OverloadedMethod();
		obj.test(null);
		obj.test(new java.lang.Object());
		obj.test(2);
		obj.test(new char[] { 'a' });
		obj.test(new char[] { 'a' }, new char[] { 'a' });

		// int b = null;
		int[] bAr = null;
		java.lang.Object ref = new int[] { 1, 2, 3 }; // valid statement?
		int[] ref1 = new int[] { new Integer(1), 2, 3 };
		int big = 1234567890;
		float approx = big;
		// System.out.println(big - (int) approx);

		WideningPrimitiveCon.go();
		m(new java.lang.Object());
		// m(2,12,12);
		 m(null);
	}

	static void m(java.lang.Object o) {
		System.err.println("Object method");
	}

	/*static void m(Object... o) {
		System.err.println("Object varargs method");
	}*/

	static void m(Integer o) {
		System.err.println("Integer method");
	}

	
	  static void m(Integer b,Integer... o) {
	  System.err.println("Object varargs method"); }
	 
	static void go() {

		// overloading, Widening + vararg and Boxing + vararg
		int[] ia = { 3, 4 };
		// foo(ia); // OK
		// foo(3);
		// foo(3, 4); // AMBIGUOUS
		// foo(3l,4);
		Integer[] IA = { 3, 4 };
		// foo(IA); // OK
		bar(null, 0);
		bar(null, null);
	}

	/*
	 * static void foo(int ia, int ib) { System.out.println("int a int b");
	 * 
	 * }
	 * 
	 * static void foo(Integer ia) { System.out.println("Integer a");
	 * 
	 * }
	 */

	static void foo(int... ia) {
		System.out.println("int array");

	}

	/*
	 * static void foo(long... la) { System.out.println("long array"); }
	 */

	static void foo(Integer... ia) {
		System.out.println("Integer array");
	}

	static void bar(int ia, int ib) {
		System.out.println("bar int a  int b");
	}

	static void bar(Integer ia, Integer ib) {
		System.out.println("bar Integer a  b ");
	}

	static void bar(Integer... ia) {
		System.out.println("bar Integer array varargs");
	}

	/*
	 * static void bar(Long... ia) {
	 * System.out.println("bar Integer array varargs"); }
	 */
	static void bar(long... la) {
		System.out.println("bar long array");
	}
}
