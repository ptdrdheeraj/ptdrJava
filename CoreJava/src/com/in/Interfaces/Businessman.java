package com.in.Interfaces;

public class Businessman implements Richman,SocialWorker {
	
	private String name;
	private String address;
	
	Businessman (){};
	public Businessman(String n,String a) {
		name = n;
		address = a;
	}
	public String getname() {
		return name;
	}
	public String getaddress() {
		return address;
	}
	public static void main (String[]args) {
		
		Businessman b = new Businessman("Rohit","Vadodra");
		System.out.println("name > "+b.getname());
		System.out.println("Address > "+b.getaddress());
		
		b.earnmoney();
		b.donation();
		b.party();
		
		SocialWorker sw = new Businessman();
		
		sw.helpToOthers();
		
		
	}
	@Override
	public void helpToOthers() {
		System.out.println("HELP To Others");
		
	}
	@Override
	public void earnmoney() {
		System.out.println("Yes ,We want earn money.");
		
	}
	@Override
	public void donation() {
		System.out.println("if we had money,then we should donate money.");
		
	}
	@Override
	public void party() {
		System.out.println("Yes,we can do it.");
		
		
		
	
		
	}
	
}
