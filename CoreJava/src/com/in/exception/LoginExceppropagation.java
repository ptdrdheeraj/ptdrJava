package com.Basic.Exception;

public class LoginExceppropagation {
	public static void main(String[]args) throws LoginException  {
		
	    auth("Vijay");}
		//catch(LoginException e)
		//{System.out.println("not equal");}

	    public static void auth(String user) throws LoginException  {	
		if(!"admi" .equals (user)) {
		LoginException e = new LoginException();
			
		throw e;//propagate through  >>> throws LoginException
		}
	
		
	
		
		
		
	}

}
