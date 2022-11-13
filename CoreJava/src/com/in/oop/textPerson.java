package com.Basic.Oop;
import java.util.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
public class textPerson {
	public static void main(String[]args) throws ParseException {
		
		Person p = new Person();
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy"); 
		
		Account n = new Account();
		Automobile a = new Automobile();
		
		p.setName("Manas");
		String j1 = p.getName();
		System.out.println(j1);
		
		Date Dob = sdf.parse("22/03/1998");
		p.setDob(Dob);
		String j2 = sdf.format(p.getDob());
		System.out.println(j2);
		
		p.setAddress("Barwani branch");
		String j3= p.getaddress();
		System.out.println(j3);
		
		System.out.println("Age is "+p.AVG_AGE);
		
		
        //Account n = new Account();
		
		n.setNumber("123456789");
		String s = n.getNumber();
		System.out.println("Account number is >> " +s);
		
		n.setAccountType("current");
		String s1 = n.getaccout();
		System.out.println("Account type is >> " +s1);
		
		n.setBalance(1500.00);
		double s2 = n.getBalance();	
		System.out.println("Account Balance is >> " +s2);
		
		n.Deposit(1000.00);
		System.out.println("deposit successfull and new balance "+n.getBalance());
		
		n.FundTransfer(1500.00);
		
	    n.Withdrawal(2000.00);
		//n.setBalance(n.getBalance());
		//double s5 = n.getBalance();
		//System.out.println("Remaining Balance "+s5);
	 
		n.Paybill(400.50);
		//n.setBalance(n.getBalance());
		//double s6 = n.getBalance();
		//System.out.println(s6);
		
	    //Automobile a = new Automobile();
		
		a.setColour("Blue");
		String st1 = a.getColour();
		System.out.println(st1);
		
		a.setSpeed(120);
		int st2 = a.getSpeed();
		System.out.println(st2);
		
		a.setMake("Tata");
		String st3 = a.getMake();
		System.out.println(st3);
		
		a.Break("press break");
		a.setSpeed(a.getSpeed());		
		int st4 = a.getSpeed();
		System.out.println("decrease speed by 20 and speed is "+ st4);
		
		a.accelerator("press accelerator");
		a.setSpeed(a.getSpeed());
		int st5 = a.getSpeed();
		System.out.println("Increase speed by 20 and speed is "+st5);
		
		a.changeGear(1);
		a.setSpeed(a.getSpeed());
		int st6 = a.getSpeed();
		System.out.println("speed is "+st6);
		
		System.out.println("Gear is  " +a.NO_OF_GEARS);
		
		
		
		
		
		
		
		
	}

}
