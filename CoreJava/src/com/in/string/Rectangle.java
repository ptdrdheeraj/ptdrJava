package com.Basic.String;

public class Rectangle extends Shape{
	
	private int len ;
	private int wid ;
	
	public Rectangle() {}
	public Rectangle(int l,int w) {
		len = l;
		wid = w;
	}
	public int setlen() {
		return len;
	}
	public int setwid() {
		return wid;
	}
	public double getArea() {
		double d = len*wid;
		return d;
	}
	

}
