package com.Basic.oopinheritance;

public class Rectangle {
	
	private int Length;
	private int width;
	
	
	public void setlength(int length) {
		Length = length;
	}	
	public int getlength() {
		return Length;
	}
    public void setwidth(int width) {
    	this.width = width;
    }
	public int getwidth() {
		return width;
	}
	public double getArea() {
		double d = Length*width;
		return d;
	}
	
	
}
