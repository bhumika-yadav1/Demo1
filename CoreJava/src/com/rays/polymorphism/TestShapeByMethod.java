package com.rays.polymorphism;

public class TestShapeByMethod {
	public static void main(String[] args) {
		
		Shape[] s = new Shape[3];
		System.out.println(s.length);
		
		s[0] = new Circle();
		s[1] = new Rectangle();
		s[2] = new Triangle();
		
		Circle c = (Circle) s[0];      //typecaste
		c.setRadius(4);
		
		Rectangle r = (Rectangle) s[1];
		r.setLength(5);
		r.setWidth(20);
		
		Triangle t = (Triangle) s[2];
		t.setBase(5);
		t.setHeight(10);
		
		double toatalArea = calcArea(s);
		System.out.println(toatalArea);
	}
	private static double calcArea(Shape[] s) {
		double totalArea = 0.0;
		for(int i=0; i<s.length; i++) {
			System.out.println(s[i].area());
			
		}
		return totalArea;
	}

}
