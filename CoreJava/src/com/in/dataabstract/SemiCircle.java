package com.in.dataabstract;

public  class SemiCircle extends Circle {
	private int radious;
	
	public SemiCircle() {}
	
	public SemiCircle(int r) {
		radious = r;
	}
    public int getradious() {
    	return radious;
    }
	public void getarea() {
		double d = Shape.PI*radious*radious;
		System.out.println(d);
	}
	
}
