package com.in.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.ObjectInputStream;


public class TestDeser {
	
	public static void main(String[] args) throws Exception   {
		
		
		FileInputStream f = new FileInputStream("/Users/sourabh/Desktop.ser");
		ObjectInputStream o = new ObjectInputStream(f);//convert byte to object
		
		Marksheet m = (Marksheet)o.readObject();
		System.out.println(m.getName());
		System.out.println(m.getAddress());
		System.out.println(m.getAge());
		System.out.println(m.getSubject());
		
	}

}
