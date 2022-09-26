package com.Basic.Exception;

public class TestLoginException {
	
	public static void main(String[]args) throws LoginException {
		
	int i = 0;
	
	if(i<1) {
	LoginException e = new LoginException();	
	throw e;
	//catch(LoginException e1) {
	//System.out.println("invalid username ");
	//System.out.println(e.getMessage());
	}
	else 
	{System.out.println(i);	}
		
	}	
	}	
		
	
	
	
	
	
	

