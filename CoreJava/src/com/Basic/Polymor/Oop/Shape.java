package com.Basic.Polymor.Oop;

public class Shape {
	
	  private String colour;
	  private int borderwidth;
	  public static final float PI = 3.14f;

	  
	  public Shape() {}//Compulsory made default Constructor
	  public Shape(String c,int b) {
		  colour = c;
		  borderwidth =b;
	  }
	  
	  
	  public String getcolour() {
		  return colour;
	  }
	  public int getborderwidth() {
		  return borderwidth;
	  }
	  public double getArea() {
	      
	      return 0;
	  }
}
	  
	  
	  
	  
	  
	  
	  

