package com.basics.inheritance;

public class AbstractEx4 {
	public static double totalArea(Shape[] arr) {
		double total = 0;

		for (Shape s : arr)
			if (s != null)
				total += s.area();

		return total;
	}

	public static void printAll(Shape[] arr) {
		for (Shape s : arr)
			System.out.println(s);
	}

	public static void main(String[] args) {
		Shape[] a = { new Circle(2.0), new Rectangle(1.0, 3.0), null };
		Shape ab = new Circle(2.8);
		System.out.println("Total area = " + totalArea(a));
		printAll(a);
	}
}



 class Circle extends Shape {
	
	
	public Circle(double rad) {
		super.shape= "ssss";
		radius = rad;
	}

	public double area() {
		return Math.PI * radius * radius;
	}

	/*public double perimeter() {
		return 2 * Math.PI * radius;
	}
*/
	public String toString() {
		return "Circle: " + radius;
	}

	private  static double radius;
}

class Rectangle extends Shape {
	public Rectangle(double len, double wid) {
		length = len;
		width = wid;
	}

	public double area() {
		return length * width;
	}

	/*public double perimeter() {
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
}

class CircRec extends Rectangle
{
	
	public CircRec(double rad) {
		super(rad,rad);
		// TODO Auto-generated constructor stub
	}


}