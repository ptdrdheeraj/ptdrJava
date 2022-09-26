package com.in.dataabstract;

public class TestShape {

	public static void main (String []args) {
		
		Shape s = new SemiCircle(5);
		s.setcolour("black");
		s.setborderwidth(50);
		
		System.out.println(s.getborderwidth());
		System.out.println(s.getcolour());
		
		Circle c = (SemiCircle) s;
		
		s.getarea();
		
		
		Shape s1 = new Rectangle();
		Rectangle r = (Rectangle)s1;
		
		r.setlen(10);
		r.setwid(5);
		s1.getarea();
		
		Shape s2 = new Triangle(10,20);
		s2.getarea();
		
		
		
	}
	
	
	
	
	
	
}
