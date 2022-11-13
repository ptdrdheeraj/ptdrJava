package com.Basic.Oop.constructor;

public class textAutomobile1 {
	
	public static void main(String[]args) {
		
		Automobile1 a = new Automobile1("Black","Suzuki",100);
		System.out.println(a.getColour());
		System.out.println(a.getMake());
		System.out.println(a.getSpeed());
		
		Automobile1 b = new Automobile1("Hyundai","Blue");
		System.out.println(b.getMake());
		System.out.println(b.getColour());
		
		Automobile1 c =new Automobile1(150);
		System.out.println(c.getSpeed());
		
		a.Break(50);
		a.Accelerator(60);
		a.ChangeGear(50);
	}
	
	
	
	

}
