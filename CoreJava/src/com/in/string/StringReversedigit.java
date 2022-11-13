package com.Basic.String;

public class StringReversedigit {
	public static void main(String[]args) {
		String name = "Vijay Dinanath Chouhan";
		String[]arr = name.split(" ");int t=0;
		for(int i = 0;i <  arr.length;i++) {
			for(int j = arr[i].length()-1; j>=0;j--) {
				System.out.print(arr[i].charAt(j));
				
			}System.out.print(" ");
			
			} 
		     for(char a= 'a';a <='z'; a++) {
		    for(int i = 0;i<name.length();i++) {
		    if(name.charAt(i)== a) {
		    	 t++;
		    }
		    		 
		    }
		    System.out.println(a+" = "+t);t=0;
		    }
		
			
			}
		
	}


