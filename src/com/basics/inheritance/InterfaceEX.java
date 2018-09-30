package com.basics.inheritance;

public class InterfaceEX implements Add {

	/*
	Integer add(Integer a , Integer b)
	{
		
		return a+b;
	}*/

	@Override
	public int add(int a, int b) {
		// TODO Auto-generated method stub
		return 0;
	}
	public static void main(String[] args) {
		InterfaceEX ex = new InterfaceEX();
		System.out.println(ex.add(2, new Integer(3)));;
		
	}
	@Override
	public int add(int a, Integer b) {
		System.out.println("from 2nd method");
		return 0;
	}
	
}

interface Add{
	
	int add(int a,int b);
	int add(int a , Integer b);
	//float add(int a , Integer b);
	
	
}