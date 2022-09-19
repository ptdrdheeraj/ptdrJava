package com.Basic.java;

public class Primenumber {
	public static void main(String[]args) {
	int num = 24;
	if( num >1) {
	for(int i = 2; i <= num;i++) {
	if(num % i == 0) {
	if(num == i) {
			
	System.out.print("The number is  prime  = "+ num);}
				
	else {
	System.out.println("The number is not prime = "+ num );
	}break;
	}
	}
	}

	}

}