package com.Basic.String;

public class StringReverseonplace {
	public static void main(String[]args) {
		String name = "Vijay Dinanath Chouhan";
		String[]name1 = name.split(" ");
		for(int i = 0;i < name.length(); i++) {
			for(int j =name1[i].length()-1;j>=0;j--) {
				System.out.print(name1[i].charAt(j));
			}System.out.print(" ");
		}
		
		
		
		
	}

}
