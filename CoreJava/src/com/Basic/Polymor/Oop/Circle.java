package com.Basic.Polymor.Oop;

public final class Circle extends Shape {
	
	private int radious;
    
    public  Circle() {}//default Constructor
    
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
