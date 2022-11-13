package com.Basic.String;

public class StringvsStringBuffer {
	public static void main(String[] args) {
		
		StringBuffer s1 = new StringBuffer("Vijay ");
		s1.append("singh");// mutable= change in memory,perticular(previous) block
        System.out.println(s1);
		
		String s2 = new String("vijay");
		s2.concat("singh");// immutable= not change in memory,(previous) block
		System.out.println(s2);

	}

}
