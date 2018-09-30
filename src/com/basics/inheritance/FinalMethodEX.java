package com.basics.inheritance;

public class FinalMethodEX  extends FinalMethod{

	double add(double a , int b)
	{
		//int c = a+b;
		return 4+b;
	}
	public static void main(String[] args) {
		FinalMethodEX   ex = new FinalMethodEX();
		System.out.println(ex.add(2d, 3));
	}
}
/**
 * can't override final method with same signatures. Even if return type is changed 
 * it wont allow
 * @author MN.Prathibha
 *
 */

class FinalMethod{
	
	
	final int add(int a , int b)
	{
		return a+b;
	}
}