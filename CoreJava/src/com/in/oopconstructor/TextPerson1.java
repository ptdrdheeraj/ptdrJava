package com.Basic.Oop.constructor;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TextPerson1 {
	
	public static void main(String [] args) throws ParseException {
		
		SimpleDateFormat sf = new SimpleDateFormat("dd/MM/yyyy");
		Date d= sf.parse("13/09/1998");
		
		person1 p = new person1("dheeraj", "indore",d);
		
		person1 p1 = new person1("abhishek", "bhopal");
		
		person1 p2 = new person1("Rohit");
		
		//Date d1 = sf.parse();
		person1 p3 = new person1("Rahul","gwaliour","25/02/1999",23);	
		
		
		System.out.println(p.getName());
		System.out.println(sf.format(p.getDob()));
		System.out.println(p.getAddress());
		
		System.out.println(p1.getName());
		System.out.println(p1.getAddress());
		
		System.out.println(p2.getName());
		
		System.out.println(p3.getName());
		System.out.println(p3.getAddress());
		System.out.println(p3.getOtherDob());
		System.out.println(p3.getAge());
	}

}
