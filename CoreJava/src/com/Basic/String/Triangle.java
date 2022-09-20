package com.Basic.String;

public class Triangle extends Shape{
	private int base;
	private int hight;
	
	public Triangle() {}
	
	public Triangle(int b,int h) {
		base  = b;
		hight = h;
	}
    public int getbase() {
		return base;
	}
	public int gethight() {
		return hight;
	}
	public double getArea() {
		double d = (base*hight)/2;
		return d;
		
	}
		
	}
