package com.in.dataabstract;

public abstract class Circle extends Shape{

	private int radious;
	
	public void setradious(int r) {
		radious = r;
	}
	public int getradious() {
		return radious;
	}
	public abstract void getarea();
	
	
}
