package com.Basic.Oop;

public class TextShape {
	
	
	public static void main(String[]args) {
		
		Shape s = new Shape();
		
		s.setColour("Blue");
		String Colourc = s.getColour(); 
		System.out.println(Colourc);
		
		s.setBorderWidth(80);
		int borderw = s.getBorderWidth();
		System.out.println(borderw);
		
		
		
		
	}
	
	
	

}
