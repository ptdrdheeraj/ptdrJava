package com.exercise9_7;

public class Rectangle {
	private  int len;
	private int wid;
	
	
	public void setlen (int l) {
		len = l;
	}
    public void wid(int w) {
    	wid = w;
    }
    public int getlen() {
    	return len;
    }
    public int getwid() {
    	return wid;
    }
    public double getarea() {
    	double d = len*wid;
    	return d;
    }
    
    
} 
