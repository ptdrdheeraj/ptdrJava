package com.Basic.java;

public class Array184_14 {
	public static void main(String[]args) {
		
		int[]a = {100,90,82,74,61,53,39,21,17,3};
		int b =100;
		add (b,a);
		
	}
    public static void add(int b ,int[]a) {
    	int j = 0; int k = 0;
    	for(int i =0;i<a.length;i++) {
    		if(b==a[i]) {
    			
    			 j =a[i];
    			 k++;}
    		}if(k>0) {
    		System.out.println(j);}
    		else{System.out.println("-1");
    	}
    	
    		
	
}
    }	
	

