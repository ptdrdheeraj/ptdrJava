package com.in.dataabstract;

public class Rectangle extends Shape{
	private int len;
	private int wid;
	
	//through setter- getter
	public void setlen(int l) {
		len = l;
	}
	public int getlen() {
		return len;
	}
	public void setwid(int w) {
		wid = w;
	}
	public int getwid() {
		return wid;
	}
	public void getarea() {
		double d  = len*wid;
		System.out.println("Area of Rectangle "+d);
	}
	
	
	
	
	

}
