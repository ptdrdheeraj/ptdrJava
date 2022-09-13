package com.Basic.mathmethod;

public class Helloname {
public static void main(String[]args) {
	
	if(args.length == 1) { // condition based name print
		
    System.out.println("Hello "+args[0]);
    
	}else {System.out.println("Parameter name is required");
	
	}System.out.println("Hello "+ args[0] +" "+ args[1]+" "+ args[2]);//name print

	for(int i= 0;i<args.length;i++) {
		
	System.out.println(i+" Hello "+args[i]);	//Hello all print
		
	}int size = args.length;
	
	if(size == 0) { // throuh variable condition based
		
	System.out.println("The parameter is required");
	
	}else {
		
	for(int i = 0; i<args.length; i++) {
		
	System.out.println(i+" Hello "+ args[i]);	
	}
	
	
	
	
	}
	
	
	
	
}
}
