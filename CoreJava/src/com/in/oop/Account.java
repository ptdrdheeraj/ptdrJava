package com.Basic.Oop;

public class Account {
	
	private String number;
	private String accountType;
	private double balance;

	
	public void setNumber(String number) {
	this.number = number ;	
	}
	public String getNumber() {
	return number;	
	}
	public void setAccountType(String account){
	accountType = account;	
	}
	public String getaccout() {
	return accountType;	
	}
    public void setBalance(double balance) {
    this.balance = balance;	
    }
	public double getBalance() {
	return balance;	
	}
	public void Deposit(double deposit) {
    setBalance(getBalance()+ deposit);	
	}
	public void FundTransfer(double fundtransfer) {
		if(getBalance() -fundtransfer >0) {
	setBalance(getBalance()-fundtransfer);
	System.out.println("Trans.succesfull and Remaining Balance "+getBalance());
	}
		else {System.out.println("Not sufficient balance ");}
	}
	public void Withdrawal(double Withdrawal) {
		if(getBalance() -Withdrawal >0) {
	setBalance(getBalance()-Withdrawal);
	System.out.println("Trans.succesfull and Remaining Balance "+getBalance());}
		else {System.out.println("Not sufficient balance ");}
	}
	public void Paybill(double paybill) {
		if(getBalance()-paybill >0) {
	setBalance(getBalance()- paybill);
	System.out.println("Trans.succesfull and Remaining Balance "+getBalance());}
		else {System.out.println("Not sufficient balance ");}
	}
	
	

}
