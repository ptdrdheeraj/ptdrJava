package com.Basic.Oop.constructor;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class person1 {
	
	
	
	private String name;
	private Date dob;
	private String address;
	private String OtherDob;
	private int Age;
	
	public person1() {
		System.out.println("default");
		
	}
	
	public person1(String name, String address, Date dob) {
		this.name=name;
		this.address=address;
		this.dob=dob;
	}

	public person1(String name, String address) {
		this.name=name;
		this.address=address;
	
	}
	public person1(String name) {
		this.name = name;
	}
	public person1(String name,String address,String OtherDob,int Age) {
		this.name = name;
		this.address = address;
		this.OtherDob = OtherDob;
		this.Age = Age;
	}
	
	
	public String getName() {
		return name;
	}
    public Date getDob() {
		return dob;
	}
    public String getAddress() {
		return address;
	}

	public int getAge() {
		return Age;
	}

	public String getOtherDob() {
		
		return OtherDob;
	}

	
	
	
	

}
