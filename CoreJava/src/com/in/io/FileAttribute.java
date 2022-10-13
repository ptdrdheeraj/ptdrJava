package com.in.io;

import java.io.File;
import java.util.Date;

public class FileAttribute {
	public static void main(String[] args) {
		
		File f = new File("/Users/sourabh/Desktop/dheeraj.txt");
			if(f.exists()) {
				System.out.println("name"+f.getName());
				System.out.println("Absolute Path"+f.getAbsolutePath());
				System.out.println("write"+f.canWrite());
				System.out.println("Read"+f.canRead());
				System.out.println("file"+f.isFile());
				System.out.println("Directory"+f.isDirectory());
				System.out.println("Date"+new Date(f.lastModified()));
				System.out.println("size "+f.length());
				
			}
		
	}

}
