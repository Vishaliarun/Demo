package com.polyTasks.shapes;

public class Square extends Shape {

	void Area() {
		System.out.println("The area of the Square is (a * a)");
	}

	void Perimeter() {
		System.out.println("The perimeter of the Square is (4 * a)");
	}

	@Override
	String draw() {
		return "drawing Square";
	}
}
