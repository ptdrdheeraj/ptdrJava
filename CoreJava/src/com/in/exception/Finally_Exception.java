package com.Basic.Exception;

public class Finally_Exception {
	
	public static void main(String[]args) {
		
    
    int i = 50;
    int j = 0;
    
    try{int k = i+j;
    System.out.println(k);
    int p = i/j;
    System.out.println(p);}
    
    catch(ArithmeticException e) {
    System.out.println(e.getMessage());
    
    String s = "Vijay";
    System.out.println(s.length());
    try {
    System.out.println(s.charAt(5));}
	catch(StringIndexOutOfBoundsException e1) {
	
	e1.printStackTrace();
	//System.out.println("String is null");
	//System.out.println("not five character in string");
	}
	}
    finally {System.out.println("done");}
    
    
     
}
}