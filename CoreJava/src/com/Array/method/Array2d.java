package com.Array.method;

public class Array2d {
	
	public static void main(String[]args) {
		int [][]arr =  new int[11][11];
		for(int j = 2; j<arr.length; j++) {
		for(int i = 1; i<arr.length; i++) {
				
		arr[i][j] = i*j;
				
		System.out.print(arr[i][j]+"\t");
			
		}System.out.println();
		System.out.println();
		System.out.println();
	
	
	
	
	}
	
	}	

}