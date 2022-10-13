package com.in.io;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class TestWrite {
	
	public static void main(String[] args) throws Exception {
		
		FileWriter w = new FileWriter("/Users/sourabh/Desktop/dheeraj.txt");
		PrintWriter pw = new PrintWriter(w);
		pw.write("key");
		pw.write(" bhopal");
		System.out.println(" i have Done");
		w.close();
		pw.close();
		
		
		
	}

}
