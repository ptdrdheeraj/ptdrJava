package com.Basic.oopinheritance;

public class TextShapein {
	
	public static void main (String[]args) {
		
		
		
		Circle c = new Circle();
		c.setColour("red");
        c.setBorderWidth(5);
        c.setRadious(5);
		
		
		System.out.println(c.getRadious());
		System.out.println(c.getColour());
		System.out.println(c.getBorderWidth());
		System.out.println("Circle area is "+c.getArea());
		
		
		Triangle t = new Triangle ();
		t.setBase(5);
		t.setHight(10);
		
		System.out.println(t.getBase());
		System.out.println(t.getHight());
		System.out.println("Triangle Area is "+t.getArea());
		
		Rectangle r = new Rectangle ();
		r.setlength(15);
		r.setwidth(10);
		
		
		System.out.println(r.getlength());
		System.out.println(r.getwidth());
		System.out.println("Rectangle area is "+r.getArea());
	}

}
