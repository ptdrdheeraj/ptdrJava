package com.Basic.java;

public class Operatormixing {
	public static void main(String[]args) {
		double fv1 ,fv2;
		int iv1 = 123;
		fv1 = (double)iv1/50;//convert integer to double.
		fv2 = iv1/50.0;
		System.out.println(fv1);
		System.out.println(fv2);
		
		char cv; 
		cv = 'A';
		int iv3=(int)cv;//we can convert char to integer,but can't int to char. 
		System.out.println(iv3);//Ascii value.
		System.out.println(cv);
		
		
		
		
		
		
		
	}
}
