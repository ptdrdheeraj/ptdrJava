package com.Basic.Exception;

public class Generic {
	public static void main(String[]args) {
		
		String s = "Krishna";
		try{System.out.println("name length is "+s.length());
		System.out.println("char 8th position is "+s.charAt(8));}
		catch(StringIndexOutOfBoundsException e) {//child class exception
		System.out.println("String anhi chhoti h");
		System.exit(0);//finally nhi chlega.
		}
		catch(RuntimeException e) {//parent class exception
		System.out.println("Error is"+e.getMessage());
		
		}
		finally {System.out.println("done h");}
		
		
		
		
		
	}

}
