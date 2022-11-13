package com.Basic.String;

public class Stringnew1vsnew2 {
	public static void main(String[]args) {
	String s1 = new String ("Vijay");
	
    String s2 = new String ("Vijay");{//not use literal pool/store heap memory
    	
	System.out.println(s1==s2);{//operators check the reference or address
		
	System.out.println(s1.equals(s2));// check value
			}
			
	String s3 = "Vijay";
	
	String s4 = "Vijay";//use literal pool
			
			
	System.out.println(s3==s4);{
		
	System.out.println(s1.equals(s2));
			}
		}
	}

}
