package com.Basic.java;

public class twoArraysfindmisingvalue {
	public static void main(String[]args) {
		
		int[]arr1 = {10,9,8,7,6,5,4,3,2,1};
		int[]arr2 = {10,9,8,7,6,5,4,3};
		
		for(int i=0;i<arr1.length;i++) { 
			boolean pass = true;
		for(int j=0;j<arr2.length;j++) {
			if(arr1[i]==arr2[j]) {
				pass = false;}
			}if (pass) {
				
			System.out.println(arr1[i]);
			}	
		}	
		}
	}	
	


