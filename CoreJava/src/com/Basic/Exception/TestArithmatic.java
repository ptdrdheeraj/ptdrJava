package com.Basic.Exception;

import java.lang.invoke.StringConcatException;

public class TestArithmatic {
	
	public static void main (String[]args) {
		
		
		
		try{//try - catch inside of try block.
		
		int k = 0;
		int p = 15;
		
		try{double d = p/k;
	    System.out.println(d);}//not print because of try block.
		
	    catch(ArithmeticException e) {
		
		System.err.println("can't divide by zero ");}//err = give red colour.
		
		String s = "Ramchandra";
		System.err.println(s.charAt(10));
		}
	    catch( Exception d) {//try - catch inside of catch block.
	    System.err.println("Out of index");
	    	
	    try{String s1 = "krishna";
	    System.out.println(s1.codePointAt(8));}
	    catch(Exception c) {
	    System.err.println("there is no index of 8");}
	    }
	
	    finally {//try -catch inside of finally block.
	    int i = 20;
	    int j = 0;
	    try{int k = i/j;
	    System.out.println(k);}
	    catch(ArithmeticException e) {
	    System.err.println("it is not possible that /0");
	    System.out.println("finish");
	    }
	    
	    
	    
	    
	    }
		
		
		
	}

}
