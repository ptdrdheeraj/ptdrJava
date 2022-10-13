package com.in.io;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import java.io.ObjectInputStream;

import java.io.ObjectOutputStream;

public class TestEmployee {
	
public static void main(String[] args) throws Exception {
	
	    Employee e = new Employee("Shyamaa","Indore",2234);
//		FileOutputStream f = new FileOutputStream("/Users/sourabh/Desktop/Emp.ser");
//	    ObjectOutputStream o = new ObjectOutputStream(f);
//		e.writeExternal(o);
//		System.out.println("i have done");
		FileInputStream fl = new FileInputStream("/Users/sourabh/Desktop/Emp.ser");
		ObjectInputStream os = new ObjectInputStream(fl);
	    e.readExternal(os);
		
		System.out.println(e.getName());
		System.out.println(e.getAddress());
		System.out.println(e.getId());
		
		
	    
	
		
		
	}

	
}
