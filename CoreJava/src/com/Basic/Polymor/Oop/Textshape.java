package com.Basic.Polymor.Oop;

public class Textshape {
	
	public static void main(String[]args) {
		Shape s4 = new Shape("Black",5);
		System.out.println(s4.getcolour());
		System.out.println(s4.getborderwidth());
		
		Shape s= new Circle (5);//Circle hold memory (value),Shape hold Address
		
		System.out.println("Area of Circle "+s.getArea());
		
		Shape s1 = new Rectangle (10,20);
		
		System.out.println("Area of rectangle "+s1.getArea());
		
		Shape s2 = new Triangle(10,5);
		
		System.out.println("Area of Triangle "+s2.getArea());
		
		Shape s3 = new Square(10,9);
		System.out.println("Area of Triangle Square "+s3);
		
		
        double total= 0;
		Shape [] arr = new Shape[4];
		arr[0] = new Circle(5);
		arr[1] = new Rectangle(10,10);
		arr[2] = new Triangle (10,8);
		arr[3] = new Square (10,9);
		for(int i=0; i<arr.length; i++) {
		total = total+arr[i].getArea();
		}
		System.out.println(total);
		
		
		
	}
	
	
	
	
	
	
	
	
	
	

}
