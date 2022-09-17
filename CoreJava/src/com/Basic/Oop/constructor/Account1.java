package com.Basic.Oop.constructor;

public class Account1 {
	private String number;
	private String accounttype;
	private double balance;

	public Account1(String number, String accounttype, double balance) {
		this.number = number;
		this.accounttype = accounttype;
		this.balance = balance;

	}

	public Account1(String number, double balance) {
		this.balance = balance;
		this.number = number;
	}
    
    
   	public Account1(double balance) {
		this.balance = balance;
	}

	public String getNumber() {
		return number;
	}

	public String getAccounttype() {
		return accounttype;
	}

	public double getBalance() {
		return balance;
	}
	

	
	public void Deposit(double amount) {
		 
		balance  = balance+amount;
		System.out.println("deposit successfull and balance is "+balance  );
	}

    public void FundTransfer(Account1 a ,double amount,Account1 b) {
		if( a.getBalance() >  b.getBalance()){
			a.balance = a.balance - amount;
			b.balance = b.balance + amount;
			System.out.println("amount transfer successfully "+amount);
			
		}else { System.out.println("insufficient balance");}
    	
	}

	public void Withdrawal(double amount) {
		
		  balance = balance - amount;
		System.out.println("withdrawal successfull and balance is  "+ amount);
			
		}
	

	public void Paybill(double amount) {
		  balance = balance - amount;
		  System.out.println("paybill successfull "+amount);
	}

}
