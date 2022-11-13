package com.Array.method;

public class Copyfromarray {
	public static void main(String[]args) {
		
	char[]copyFrom = {'a','e','i','o','u','d','h','e',};
	char[]copyTo = new char[5];
	System.arraycopy(copyFrom,3,copyTo,0,5);//1=start index,0= start index, 4 = no.of element
	System.out.println(new String(copyTo));
		
		
		
	}

}
