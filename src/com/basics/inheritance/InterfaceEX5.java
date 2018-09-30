package com.basics.inheritance;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

public class InterfaceEX5 extends java.io.FilterInputStream {
	
	FilterInputStream  lFile = this;
	
	protected InterfaceEX5(InputStream in) {
		super(in);
		System.out.println(this);
		System.out.println(this.in);
		System.out.println(in);
		//System.out.println( lFile.in );
	}
	
}

final class Abc extends Shape implements Stretchable1 {

	@Override
	public Shape stretch(int factor) throws IOException {
		return this;

	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return 0;
	}

		public Abc()
		{
			super ();
		}
}

interface Stretchable1 {
	Shape stretch(int factor) throws IOException;
}

interface Stretchable {
	RectangleIn stretch(int factor) throws IOException;
}
abstract interface Stretchable2 {
	RectangleIn stretch(Shape factor) throws IOException, ArrayIndexOutOfBoundsException;
}

interface Expandable extends Stretchable, Stretchable1 {

	//int stretch(int factor) throws ArrayIndexOutOfBoundsException;

};

class RectangleIn extends Shape implements Stretchable , Stretchable1{
	
	
/*	@Override
	public  stretch(int factor) throws IOException {
		// TODO Auto-generated method stub
		return new RectangleIn();
	}*/
	
	
	
	
	

	@Override
	public RectangleIn stretch(int factor) throws IOException {
		// TODO Auto-generated method stub
		return new RectangleIn();
	}
	
	
	
	
	
	
	
	
	/* Remainder of class unchanged from Figure 4.12 */

	Double l = new Double(2);

	/*@Override
	public int stretch(long factor) {
		if (factor <= 0)
			// throw new IllegalArgumentException();

			if (length > width)
				length *= factor;
			else
				width *= factor;
		return (int) 2l;
	}*/

	/*
	 * @Override public void stretch(Float factor) throws
	 * ArrayIndexOutOfBoundsException { // TODO Auto-generated method stub
	 * 
	 * }
	 */

/*	// @Override
	public void stretch(double factor) throws ArrayIndexOutOfBoundsException {
		// TODO Auto-generated method stub

	}*/

	public RectangleIn(double len, double wid) {
		length = len;
		width = wid;
	}
	public RectangleIn()
	{
		
	}

	public double area() {
		return length * width;
	}

/*	public double perimeter() {
		return 2 * (length + width);
	}*/

	public String toString() {
		return "Rectangle: " + length + " " + width;
	}

	public double getLength() {
		return length;
	}

	public double getWidth() {
		return width;
	}

	private double length;
	private double width;
/*
	@Override
	public void stretch(int factor) throws IOException, ArrayIndexOutOfBoundsException {
		// TODO Auto-generated method stub

	}*/
/*
	@Override
	public Shape stretch(Shape factor) throws IOException, ArrayIndexOutOfBoundsException {
		// TODO Auto-generated method stub
		return null;
	}*/



	/*@Override
	public Float stretch(int factor) throws IOException {
		// TODO Auto-generated method stub
		return 0f;
	}*/


}