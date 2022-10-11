package com.Basic.Collection;

public class Marksheet implements Comparable<Marksheet>{
	private int Rollno;
	private String fname;
	private String lname;
	private int phy;
	private int che;
	private int math;
	public int getRollno() {
		return Rollno;
	}
	public void setRollno(int rollno) {
		Rollno = rollno;
	}
	public String getName() {
		return fname;
	}
	public void setName(String name) {
		this.fname = name;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public int getPhy() {
		return phy;
	}
	public void setPhy(int phy) {
		this.phy = phy;
	}
	public int getChe() {
		return che;
	}
	public void setChe(int che) {
		this.che = che;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	@Override
	public int compareTo(Marksheet m) {//compareTo()for unic Attribute
		
		return Rollno - (m.Rollno);
		//if unic attribute in int than use -
		//otherwise(if attri.use in string) Rollno.compareTo(m.Rollno)
	}
		
	
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

