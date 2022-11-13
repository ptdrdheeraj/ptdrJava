package com.Array.method;

public class Simplearray {

	public static void main(String[] args) {

		int[] arr = new int[5];
		arr[0] = 5;
		arr[1] = 10;
		arr[2] = 15;// sout (arr[3])=bydefault=0;
		System.out.println(arr[0] + arr[1]);
		System.out.println("Array " + arr[0] + arr[1]);// value not add after "string"
		for (int v : arr) {
			System.out.print(v + " ,");
		}
		
		

	}

}
