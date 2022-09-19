package com.Basic.Polymor.Oop;

public class Rectangle extends Shape{
	private int len;
	private int wid;
	
	
	public Rectangle() {}
	public Rectangle(int l,int w) {
	        len = l;
			wid = w;
		}
	
	public int getlen() {
		return len;
	}
	public int getwid() {
		return wid;
	}
	
	public double getArea() {
		double d = len*wid;
		return d;
	}
	
	
	

}
