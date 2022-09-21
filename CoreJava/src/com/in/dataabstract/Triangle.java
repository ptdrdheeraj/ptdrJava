package com.in.dataabstract;

public class Triangle extends Shape{
	private int base;
	private int hight;
	
	//through constructor
	public Triangle(int b,int h) {
		base = b;
		hight = h;
	}
	public int getbase() {
		return base;
	}
	public int gethight() {
		return hight;
	}
	public void getarea() {
		double d = base*hight/2;
		System.out.println("Area of Triangle "+d);
	}

}
