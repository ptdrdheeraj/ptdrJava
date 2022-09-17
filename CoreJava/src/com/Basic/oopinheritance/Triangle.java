package com.Basic.oopinheritance;

public class Triangle extends Shapein{
	private int Base;
	private int Hight;
	
	public int getBase() {
		return Base;
	}
	public void setBase(int base) {
		Base = base;
	}
	public int getHight() {
		return Hight;
	}
	public void setHight(int hight) {
		Hight = hight;
	}
	public double getArea() {
		double a = (Base*Hight)/2;
	    return a;
	}
	
	

}
