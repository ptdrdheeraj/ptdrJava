package com.Basic.oopinheritance;

import com.Basic.Oop.Shape;

public class Circle extends Shapein {
	
	private int radious;
	
	public int getRadious() {
		return radious;
	}
    public void setRadious(int radious) {
		this.radious = radious;
	}
	
    public double getArea() {
    	double a = Shapein.PI*radious*radious;
    	return a;
    }
	

	
	
	
}
