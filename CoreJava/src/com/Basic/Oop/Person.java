package com.Basic.Oop;
import java.util.Date;
public class Person {
	
	private String name;
	private Date dob;
	private String address;
	public static  final int AVG_AGE = 24;
	
	public void setName(String name) {
	this.name = name;	
	}
	public String getName() {
	return name;	
	}
	public void setDob(Date dob) {
	this.dob = dob;	
	}
	public Date getDob() {
	return dob;	
	}
	public void setAddress(String address) {
	this.address = address;	
	}
	public String getaddress() {
	return address;	
	}
	
	
	

}
