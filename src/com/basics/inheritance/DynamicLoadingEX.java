package com.basics.inheritance;
/**
 * 
 * @author MN.Prathibha
 *Static and dynamic Loading demo
 */
public class DynamicLoadingEX {

	public static void whichFoo(SuperBase arg1, SuperBase arg2) {
		// It is guaranteed that we will call foo( Base )
		// Only issue is which class's version of foo( Base )
		// is called; the dynamic type of arg1 is used
		// to decide.
		arg1.foo(arg2);
	}

	public static void main(String[] args) {
		SuperBase b = new SuperBase();
		Derived d = new Derived();

		whichFoo(b, b);
		whichFoo(b, d);
		whichFoo(d, b);
		whichFoo(d, d);
	}

}

class SuperBase {
	public void foo(SuperBase x) {
		System.out.println("Base.Base");
	}

	public void foo(Derived x) {
		System.out.println("Base.Derived");
	}
}

class Derived extends SuperBase {
	public void foo(SuperBase x) {
		System.out.println("Derived.Base");
	}

	public void foo(Derived x) {
		System.out.println("Derived.Derived");
	}
}
