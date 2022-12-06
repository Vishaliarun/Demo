package com.polyTasks.shapes;

public class Triangle extends Shape  {
	void Area() {
		System.out.println("The area of the triangle is (1 / 2 * base * height)");
	}

	void Perimeter() {
		System.out.println("The perimeter of the triangle is (a+b+c)");
	}

	@Override
	String draw() {
		
		return "drawing triangle";
	}
}
