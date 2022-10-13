package com.in.io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class TestInputSReader {
	
	public static void main(String[] args) throws Exception {
		
		System.out.println("Start.....");
		InputStreamReader ir = new InputStreamReader(System.in);
		
		BufferedReader br = new BufferedReader(ir);
		
		PrintWriter pr = new PrintWriter("/Users/sourabh/Desktop/stream.txt");
		String Line =br.readLine();
		while(!Line.equals("DP")) {
			pr.write(Line);
			Line=br.readLine();
		}
		br.close();
		pr.close();
	}

}
