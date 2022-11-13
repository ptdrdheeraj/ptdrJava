package com.Basic.java;

public class Fibbonacciseries {
	public static void main(String[]args) {
	int n = 10,firstterm =0,secondterm = 1;
	for(int i = 0;i<n;i++) {
	System.out.print(firstterm+ ", ");
	
	int nxtterm = firstterm + secondterm;
	firstterm = secondterm;
   	secondterm = nxtterm;
	}	
		

		
		
		
		
	}

}
