package com.Basic.Polymor.Oop;

public class Square extends Shape {
	
	private int side;
	private int wide;
	
	public Square() {}
	
	public Square(int l,int w) {
		side = l;
		wide = w;
		
	}
	public int getside() {
		return side;
	}
	public int getside1() {
		return wide;
	}
	public double getArea() {
		double d = side*wide;
		return d;
	}
	

}
