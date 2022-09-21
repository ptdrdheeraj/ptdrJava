package com.Basic.String;

public  class Shape {
	
	private int borderwidth;
	private String colour;
	public static final float PI = 3.14f;//final attributes 
	
	public Shape() {}
	
	public void setborderwidth(int b) {
		borderwidth = b;
	}
	public int getborderwidth() {
		return borderwidth;
	}
	public void setcolour(String c) {
		colour = c;
	}
	public String getcolour() {
		return colour;
	}
	public double getArea() { 
		return 0;
	}

}
