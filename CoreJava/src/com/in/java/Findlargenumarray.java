package com.Basic.java;

public class Findlargenumarray {
	
	public static void main(String[]args) {
		
	
		int[]arr = {997,19,5249,187,96,77};
		int a=arr[0];int b=0;
		for(int i=0;i<arr.length;i++) {
			
		if(arr[i]>a){
			
		b = a;
	    a=arr[i];
	    
	    
		}else if (arr[i]>b&&arr[i]!=a) {
		     b=arr[i];	
		               }
		}
		
		System.out.println("The second largest number is "+b);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		}
	}