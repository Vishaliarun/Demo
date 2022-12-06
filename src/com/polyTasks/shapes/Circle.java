package com.polyTasks.shapes;

public class Circle extends Shape {
	
	void Area() {
		//super.Area();
		//super.Perimeter();
		System.out.println("The area of the circle is (pi*r*r)");
	}

	void Perimeter() {
		System.out.println("The perimeter of the circle is (2*pi*r)");
	}

	@Override
	String draw() {
		
		return "drawing circle";
	}
}
