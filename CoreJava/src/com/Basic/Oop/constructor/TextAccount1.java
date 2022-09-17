package com.Basic.Oop.constructor;

import com.Basic.Oop.Account;

public class TextAccount1 {
	
	public static void main(String[]args) {
		
		Account1 a = new Account1("123456789","Current",1100.50); 
	
		System.out.println(a.getNumber());
		System.out.println(a.getAccounttype());
		System.out.println("balance is "+a.getBalance());
		Account1 b = new Account1("456789123",500.00);
		System.out.println(b.getNumber());
		System.out.println("balance is "+b.getBalance());
		
		a.Deposit(400.00);
		
 		a.FundTransfer(a, 550.00, b);
 		
 		b.Withdrawal(100.00);
 		 
 		a.Paybill(500.50);
	}
	

}
