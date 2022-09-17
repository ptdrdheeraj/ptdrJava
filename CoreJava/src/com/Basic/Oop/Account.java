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
	setBalance(getBalance()-fundtransfer);
	}
	public void Withdrawal(double Withdrawal) {
	setBalance(getBalance()-Withdrawal);	
	}
	public void Paybill(double paybill) {
	setBalance(getBalance()- paybill);	
	}
	
	

}
