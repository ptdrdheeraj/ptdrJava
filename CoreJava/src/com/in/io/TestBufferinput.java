package com.in.io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class TestBufferinput {

	public static void main(String[] args) throws Exception {
		
		FileInputStream f = new FileInputStream("/Users/sourabh/Downloads/handsom.jpeg");
		BufferedInputStream b = new BufferedInputStream(f);
		
		FileOutputStream o = new FileOutputStream("/Users/sourabh/Girl.jpg");
		BufferedOutputStream bo = new BufferedOutputStream(o);
		
		byte[]buff = new byte[256];
		int ch = b.read(buff);
		while(ch>0) {
			bo.write(buff,0,ch);
			ch = b.read(buff);
		}
		System.out.println("we have done");
		b.close();
		bo.close();
		
	}
	
	
	
	
	
	
}
