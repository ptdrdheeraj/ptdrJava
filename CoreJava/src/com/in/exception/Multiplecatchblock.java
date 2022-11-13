package com.Basic.Exception;

public class Multiplecatchblock {
	public static void main (String[]args) {
		
		
		String s = null;
		try{
		System.out.println("char at 6th position is "+s.charAt(6));
		System.out.println("name length is "+s.length());}
		
		catch(StringIndexOutOfBoundsException e) {
		System.out.println("String is small ");
		}
		catch(NullPointerException e1) {
		System.out.println("name nhi h");	
		}
		
		finally {System.out.println("it's done ");
		}
		
		
		
	}

}
