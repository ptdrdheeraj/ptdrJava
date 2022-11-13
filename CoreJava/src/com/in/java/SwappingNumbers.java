package com.Basic.java;

public class SwappingNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int a = 10;
    int b = 20;
    
    System.out.println("Before Swipping a is " + a + " And b is " + b);
    a = b-a;
    b = a ;
    a = a + b;   
    System.out.println("After Swipping a is " + a + " And b is " + b);

    
	}

}
