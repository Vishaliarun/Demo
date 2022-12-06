package com.polyTasks.box;

public class Box3D extends Box {
	public Box3D(int length, int breadth, int height) {
		super(length, breadth, height);
	}
	void area() {
		System.out.println("this is the area of Box3D");
	}
	void volume() {
		System.out.println("this is the volume of Box3D");
	}
}
