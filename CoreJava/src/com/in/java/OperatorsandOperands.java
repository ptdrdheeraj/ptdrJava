package com.Basic.java;

public class OperatorsandOperands {
	public static void main(String[]args) {
		
		
		int i = 0;
		System.out.println(++i + ++i + ++i + ++i + "," + ++i + ++i); //addition hoga.but after string concate
		System.out.println("" + ++i + ++i + ++i + ++i);//as a string h ( concate krega);
	    double resu ;
		double d = 10;
		double e = 5;
		resu = d/e;
		System.out.println(resu);//double to integer convert automatic (big to small data type)
		
		
	    float result;
	    int a,b;
	    a =25;b = 10;
	    result = (float)a/b;//Typecasting = pre.datatype change in other pre.data type.
	    System.out.println(result);
	    
	    int m = 10;
	    int n = 10;
	    String ans = (m==n)?"equal":"not equal";//ternary operator
	    System.out.println(ans);
	    
	    String str = "5.5";
	    double j = Double.parseDouble(str);//convert string to other pre.data type by parsing.
	    System.out.println(j);
	    
	    int s = 20;
	    int t = 10;
	    
	    String  st = String.valueOf(t+s);// convert pre.data type to string.
	    System.out.println(st);
	    
	    
	    
	
	
	}

}
