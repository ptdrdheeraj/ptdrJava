package com.in.io;


import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class TestSer {
	public static void main(String[] args) throws Exception {
		
		FileOutputStream f = new FileOutputStream("/Users/sourabh/Desktop.ser");
		
		//declare only path(not create file) in paramtr.it's automatic create file where u give path.
		ObjectOutputStream o = new ObjectOutputStream(f); //convert obj.to byte
		
		Marksheet m = new Marksheet(14,"Shayam","indore","Bio");
		
		o.writeObject(m);
		f.close();
		o.close();
		
	 System.out.println("sdf");
	 
	 
	 
	 
	 
	 
	}
}
