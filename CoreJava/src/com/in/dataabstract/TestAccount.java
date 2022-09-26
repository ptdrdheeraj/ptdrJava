package com.in.dataabstract;

public class TestAccount {
	
	public static void main (String[]args) {
		
		
		AccountOver a = new AccountOver();
		System.out.println(a.getamount());
		
		SavingAccount sa = new SavingAccount();
		System.out.println("Amount "+sa.getamount());
		
		SavingAccount sb = new SavingAccount();
		System.out.println("Amount of Both Class "+sb.getamount1());
		
		AccountOver ao = new AccountOver();
		System.out.println(ao.getamount());
		
		
	}
	

	
}
