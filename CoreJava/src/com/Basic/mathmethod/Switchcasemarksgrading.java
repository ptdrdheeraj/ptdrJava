package com.Basic.mathmethod;

public class Switchcasemarksgrading {
	public static void main(String[]args) {
		
	int a = 101;
	if(a<=100) {
		
		switch(a/10){
		case 9,10:
		System.out.println("The grade is A++ ");	
		break;
		
		case 8:
		System.out.println("The grade is A+");
		break;
		
		case 7:
		System.out.println("The grade is A " );	
		break;
		
		case 6:
		System.out.println("The grade is B++");	
		break;
		
		case 4,5:
		System.out.println("The grade is B");	
		break;
		
		case 1,2,3:
		System.out.println("Fail");
		break;
		
		default:
		System.out.println("invalid");
	}
	}
	else {
	System.out.println("invalid");
	
	}

}}
