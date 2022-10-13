package com.in.io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class TestRead {
	
	public static void main(String[] args) throws Exception {
		
		FileReader reader = new FileReader("/Users/sourabh/Desktop/html-css/untitled folder/myapp notes/first part of myapp/java.txt");
		BufferedReader r = new BufferedReader(reader);
 
		String ch = r.readLine();
		while(ch != null) {
			System.out.println(ch);
			ch = r.readLine();
		}
	    reader.close();
	

	    // Scanner sc = new Scanner(reader);
	 
	     //while(sc.hasNext()) {
		 //System.out.println(sc.nextLine());
		 //reader.close();
	 //}
	 
	 
	}
}
