package com.in.dataabstract;

public abstract  class Shape {
	
	private String colour;
	private int borderwidth;
	public static final float PI = 3.14f;
	
	
	public void setcolour(String c) {
		colour = c;
	}
	public String getcolour() {
		return colour;
	}
	public void setborderwidth(int b) {
		borderwidth = b;
	}
	public int getborderwidth() {
		return borderwidth;
	}
    public abstract  void getarea() ;//use abstract method (never body)
    
}
