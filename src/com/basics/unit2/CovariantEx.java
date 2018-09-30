package com.basics.unit2;

import java.awt.Graphics;
import java.util.Arrays;

public class CovariantEx {

	public static void main(String args[]) throws CloneNotSupportedException {
		
		System.out.println(Arrays.asList(BengalTiger.class.getMethods()));;
		AfricaZoo afZoo = new AfricaZoo();
		System.out.println(afZoo.getWildAnimal().whoAreYou());
		IndiaZoo inZoo = new IndiaZoo();
		System.out.println(inZoo.getWildAnimal().whoAreYou());
		
		WildAnimal aClassyThing = new WildAnimal ();
		java.lang.Object aCopy = aClassyThing.clone ();
	}

}

class WildAnimal  {
	public String willYouBite() {
		return "Yes";
	}
	/*public Integer willYouBite() {
		return 0;
	}*/
	public String whoAreYou() {
		return "wildanimal";
	}
	
	@Override
	protected java.lang.Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
}

class Lion extends WildAnimal {
	public String whoAreYou() {
		return "Lion";
	}
	public String willYouBite() {
		return null;
	}
}

class BengalTiger extends WildAnimal {
	public String whoAreYou() {
		return "Bengal Tiger";
	}
}

class Zoo {
	WildAnimal getWildAnimal() {
		return new WildAnimal();
	}
}

class AfricaZoo extends Zoo {
	@Override
	WildAnimal getWildAnimal() {
		return new Lion();
	}
	
	//@Override
	/*BengalTiger getWildAnimal() {
		return new BengalTiger();
	}*/
}

class IndiaZoo extends Zoo {
	@Override
	BengalTiger getWildAnimal() {
		return new BengalTiger();
	}
}































class Shape {
    public void draw(Graphics g, int x, int y) {}
}

class Circle extends Shape {
    public void draw(Graphics g, float x, float y) {}
    // Circle.draw overloads the inheried Shape.draw 
    // -- argument types for 'x' and 'y' are different here.
}

class ShapeFactory {
    public Shape newShape() {
		return null;}
}
/*class CircleFactory extends ShapeFactory {
    public Circle newShape() {}
} */



class CircleFactory extends ShapeFactory {
    public Circle newShape() {
       // your code from the source file
       return new Circle();
    }
  /*  // javac generated method in the .class file
    public Shape newShape() {
       // call the other newShape method here -- invokevirtual newShape:()LCircle;
    	return new Shape();
    } */
}