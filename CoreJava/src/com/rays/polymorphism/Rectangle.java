package com.rays.polymorphism;

public class Rectangle extends Shape{
	
	private int length;
	private int width;
	
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	
	public int getWidth() {
		return borderWidth;
	}
	public void setWidth(int borderWidth) {
		this.borderWidth = borderWidth;
	}
	
	public double area() {
		return length*width;
	}

}
