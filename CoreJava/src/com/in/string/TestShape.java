package com.Basic.String;

public class TestShape {
	
	public static void main(String[]args) {
		
		Shape s = new Shape();
		s.setcolour("Black");
		s.setborderwidth(50);
		
		System.out.println(s.getcolour());
		System.out.println(s.getborderwidth());
		
	    Shape s1 = new Circle(5);
		System.out.println(s1.getArea());
		
		Shape s3 = new Triangle(10,20);
		System.out.println(s3.getArea());
		
		Shape s2 = new Rectangle (20,15);
		System.out.println(s2.getArea());
		
		
		
		
		
	}
	
	
	
	
	

}
