package com.rays.constructor;

public class Shape {
	
	public String Color;
	public int borderWidth;
	
	public Shape() {
		System.out.println("this is default constructor");
	}
	
	public Shape( String Color) {
		this.Color = Color;
		System.out.println(this.Color);
	}
	
	public Shape(int borderWidth) {
		this.borderWidth = borderWidth;
		System.out.println(this.borderWidth);
	}
}
