package com.in.io;

import java.io.Serializable;

public class Marksheet implements Serializable {

	
	private int Age;
	private String name;
	private String Address;
	private String Subject;
	
	public Marksheet() {}
	
	public Marksheet(int a,String n,String add,String s) {
		
		name = n;
		Address = add;
		Age = a;
		Subject = s;
	}
	public int getAge() {
		return Age;
	}

	public String getName() {
		return name;
	}

	public String getAddress() {
		return Address;
	}

	public String getSubject() {
		return Subject;
	}

		
	
}
