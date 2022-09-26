package com.exercise9_7;

public class Circle extends Shape {
	private int radious;
	
	public void setradious(int r) {
		radious = r;
	}
    public int getradious() {
    	return radious; 
    }
	public double getarea() {
		double d = Shape.PI*radious*radious;
		return d;
	}
	
}
