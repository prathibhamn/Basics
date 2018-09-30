package com.basics.inheritance;

import javax.net.ssl.ExtendedSSLSession;

public class StaticClass2 {
	public static void printAll(Person[] arr) {
		int b= 30;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != null) {
				//System.out.print("[" + i + "] ");
				//System.out.println(arr[i].toString());
				b=b+80;
				System.out.println(b++);
			}
		}
		
	}

	public static void main(String[] args) {
		Person[] p = new Person[4];

		p[0] = new Person("joe", 25, "New York", "212-555-1212");
		p[1] = new Student("jill", 27, "Chicago", "312-555-1212", 4.0);
		p[3] = new Employee("bob", 29, "Boston", "617-555-1212", 100000.0);
		StaticClass2 stic = new StaticClass2();
		
		stic.printAll(p);
	}

}

class Person {
	public Person(String n, int ag, String ad, String p) {
		name = n;
		age = ag;
		address = ad;
		phone = p;
	}

	public String toString() {
		return getName() + " " + getAge() + " " + getPhoneNumber();
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public String getAddress() {
		return address;
	}

	public String getPhoneNumber() {
		return phone;
	}

	public void setAddress(String newAddress) {
		address = newAddress;
	}

	public void setPhoneNumber(String newPhone) {
		phone = newPhone;
	}

	private String name;
	private int age;
	private String address;
	private String phone;

}

class Student extends Person {
	public Student(String n, int ag, String ad, String p, double g) {
		super(n, ag, ad, p);
		gpa = g;
	}

	public String toString() {
		return super.toString() + getGPA();
	}

	public double getGPA() {
		return gpa;
	}

	private double gpa;
}

class Employee extends Person {
	public Employee(String n, int ag, String ad, String p, double s) {
		super(n, ag, ad, p);
		salary = s;
	}

	public String toString() {
		return super.toString() + " $" + getSalary();
	}

	public double getSalary() {
		return salary;
	}

	public void raise(double percentRaise) {
		salary *= (1 + percentRaise);
	}

	private double salary;
}

class StudentEmployee extends Student{

	public StudentEmployee(String n, int ag, String ad, String p, double g) {
		super(n, ag, ad, p, g);
		// TODO Auto-generated constructor stub
	}

	
	
	
	
	
} 
