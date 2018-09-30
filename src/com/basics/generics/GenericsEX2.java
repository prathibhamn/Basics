package com.basics.generics;

import java.util.ArrayList;
import java.util.List;

abstract class Animal {
	// Some common functionalities here.
}

interface Sleepable {
	public void sleep();
}

interface Runnable {
	public void run();
}

interface Eatable {
	public void eat();
}

class Dog extends Animal implements Sleepable, Runnable, Eatable {
	public void sleep() {
		System.out.println("Dog is sleeping");
	}

	public void run() {
		System.out.println("Dog is running");
	}

	public void eat() {
		System.out.println("Dog is eating");
	}
}

class Cat implements Sleepable, Runnable ,Eatable{

	@Override
	public void eat() {
		System.out.println("Cat is eating");
		
	}

	@Override
	public void run() {
		System.out.println("Cat is running");
		
	}

	@Override
	public void sleep() {
		System.out.println("Cat is sleeping");
		
	}
	
	
	
}

class AnimalActions<A extends Sleepable & Runnable & Eatable> {
	private A animal;

	public AnimalActions() {
		
	}
	public AnimalActions(A animal) {
		this.animal = animal;
	}

	public A getAnimal() {
		return animal;
	}

	public void setAnimal(A animal) {
		this.animal = animal;
	}

	public void doActions() {
		animal.sleep();
		animal.run();
		animal.eat();
	}
}

public class GenericsEX2 {

	public static void main(String[] args) {
		AnimalActions<Dog> animal = new AnimalActions<Dog>(new Dog());
		animal.doActions();
		
		AnimalActions<Cat> cat = new AnimalActions<Cat>(new Cat());
		cat.doActions();
		
		List<Animal> animals = new ArrayList<Animal>();
		animals.add(new Dog()); // This will work too.
		//animals.add(new Cat()); //
	}

}