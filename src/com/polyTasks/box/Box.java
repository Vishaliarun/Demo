package com.polyTasks.box;

public class Box {
	private int length;
	private int breadth;
	private int height;
	
	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getBreadth() {
		return breadth;
	}

	public void setBreadth(int breadth) {
		this.breadth = breadth;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public Box(int length, int breadth, int height) {
		
		this.length = length;
		this.breadth = breadth;
		this.height = height;
	}
	
	void area() {
		System.out.println("this is the area of the box");
	}
	
	void volume() {
		System.out.println("this is the volume of the box");
	}
}
