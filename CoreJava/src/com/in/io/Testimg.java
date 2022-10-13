package com.in.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Testimg {
	
	public static void main(String[] args) throws Exception {
		
		FileInputStream f = new FileInputStream("/Users/sourabh/Downloads/dheeraj.jpeg");
		
		FileOutputStream o = new FileOutputStream("/Users/sourabh/img.jpeg");
		
		int c=f.read();
		
		while(c!=-1) {
			o.write(c);
			c=f.read();
			
		}
		System.out.println("copied");
		
		f.close();
		o.close();
		
		
		
		
		
		
		
		
		
		
	}

}
