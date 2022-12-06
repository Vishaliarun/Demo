package com.polyTasks.shapes;

import java.util.ArrayList;
import java.util.List;

public class MainShape {
	public static void main(String[] args) {
		Shape obj = new Circle();
		//obj.Area();
		//obj.Perimeter();
		
		Shape tri = new Triangle();
		//tri.Area();
		//tri.Perimeter();
		
		Shape sq = new Square();
		//sq.Area();
		//sq.Perimeter();
		
		List<Shape> shapes = new ArrayList<>();
		shapes.add(sq);
		shapes.add(tri);
		shapes.add(obj);
		
		draw(shapes);
		
	}
	
	
	private static void draw(List<Shape> shapes) {
		for (int i = 0; i < 15; i++) {
//			int random = (int) (Math.random()*100);
			switch (i%10) {
				case 0:case 1:case 2:case 3:
					System.out.println(shapes.get(0).draw());;
					break;
				case 4: case 5: case 6:
					System.out.println(shapes.get(1).draw());;
					break;
				default:
					System.out.println(shapes.get(2).draw());;
					break;
			}
		}
	}
}
