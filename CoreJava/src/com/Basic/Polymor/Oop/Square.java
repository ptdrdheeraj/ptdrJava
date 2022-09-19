package com.Basic.Polymor.Oop;

public class Square extends Shape {
	
	private int side;
	private int side1;
	
	public Square() {}
	
	public Square(int l,int w) {
		side = l;
		side1 = w;
		
	}
	public int getside() {
		return side;
	}
	public int getside1() {
		return side1;
	}
	public double getArea() {
		double d = side*side1;
		return d;
	}
	

}
