package com.Basic.String;

public class StringBufferallmethod {
	public static void main(String[]args) {
		StringBuffer sb = new StringBuffer("Vijay ");
	    sb.append("dinanath chouhan");
	
				
			System.out.println(sb.length());
			System.out.println(sb.capacity());
			System.out.println(sb.charAt(3));
			System.out.println(sb.indexOf("chou"));
			System.out.println(sb.replace(0,3,"s"));
			System.out.println(sb.reverse());
			}
			
			
		
		
	

}
