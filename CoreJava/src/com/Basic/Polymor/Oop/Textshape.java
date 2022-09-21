package com.Basic.Polymor.Oop;

public class Textshape {
	
	public static void main(String[]args) {
		Shape s4 = new Shape("Black",5);
		System.out.println(s4.getcolour());
		System.out.println(s4.getborderwidth());
		
		Shape s1 = new Circle (5);//Circle hold memory (value),Shape hold Address
		
		System.out.println("Area of Circle "+s1.getArea());
		
		Shape s2 = new Rectangle (10,20);
		
		System.out.println("Area of rectangle "+s2.getArea());
		
		Shape s3 = new Triangle(10,5);
		
		System.out.println("Area of Triangle "+s3.getArea());
		
		Shape s5 = new Square(10,10);
		System.out.println("Area of  Square "+s5.getArea());
		
		Shape[] s = new Shape[4];
		s[0] = getshape(1);
		s[1] = getshape(2);
	    s[2] = getshape(3);
	    s[3] = getshape(4);
		
	    //s[3] = getshape(5);//print null in get shape because condition not match,so s[null] = ? 
			
		System.out.println("Return type AREA "+s[1].getArea());
		System.out.println("Return type AREA "+s[2].getArea());
		System.out.println("Return type AREA "+s[3].getArea());
		System.out.println("Return type AREA "+s[0].getArea());
		//System.out.println("yyy"+s[4].getArea());
		//System.out.println("kkkkkkkkkkkkk"+getshape(5));
        double total= 0;
		Shape [] arr = new Shape[4];
		arr[0] = new Circle(5);
		arr[1] = new Rectangle(10,10);
		arr[2] = new Triangle (10,8);
		arr[3] = new Square (23,2);
	
	    total  = calarea(arr);
		System.out.println("Total Area of all " +total);
		
	}  //polymorphism for method arguments
		public static double calarea(Shape[]arr) {
			double total=0;
			for(int i=0; i<arr.length; i++) {
				 total = total+arr[i].getArea();
				}
			return total;
		}//polymorphism using return type 
		public static Shape getshape(double i) {//shape = class name,(we can take as a object)getShape = method name
			if(i==1) return new Circle(5);
			if(i==2) return new Rectangle(5,4);
		    if(i==3) return new Triangle(4,5);		
			if(i==4) return new Square(4,4);
			
			return null;
		}
		
}
		
	
	
	
	
	
	
	
	
	
	
	


