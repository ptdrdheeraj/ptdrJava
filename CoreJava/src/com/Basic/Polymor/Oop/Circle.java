package com.Basic.Polymor.Oop;

public class Circle extends Shape {
	
	private int radious;
    
    public  Circle() {}
    
	public Circle(int r) {
		
		radious = r;
    }
    public int getradious() {
    	return radious;
    	
    }
	public double getArea() {
		double d =Shape.PI*radious*radious;
		return d;
	}
	
	
	

}
