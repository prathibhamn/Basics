package com.basics.generics;

public class GenericsEX5 {
	// Sample program to exercise generic singleton
	public static void main(String[] args) {

		String[] strings = { "jute", "hemp", "nylon" };
		UnaryFunction<String> sameString = identityFunction();
		for (String s : strings)
			System.out.println(sameString.apply(s));

		Number[] numbers = { 1, 2.0, 3L };
		UnaryFunction<Number> sameNumber = identityFunction();
		for (Number n : numbers)
			System.out.println(sameNumber.apply(n));
	}

	private static UnaryFunction<java.lang.Object> IDENTITY_FUNCTION = new UnaryFunction<java.lang.Object>() {
		public java.lang.Object apply(java.lang.Object arg) {
			return arg;
		}
	};

	// IDENTITY_FUNCTION is stateless and its type parameter is // unbounded so
	// it's safe to share one instance across all types.

	@SuppressWarnings("unchecked")
	public static <T> UnaryFunction<T> identityFunction() {
		return (UnaryFunction<T>) IDENTITY_FUNCTION;
	}

}

interface UnaryFunction<E> {
	E apply(E e);
}