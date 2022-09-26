package com.in.dataabstract;

public class PersonCons {
	
       protected String firstname;
       protected String lastname;
       protected String address;
       
       
       public PersonCons() {
    	   System.out.println("Default cons.");
       }
       public PersonCons(String fn,String ln) {
    	   
    	   firstname = fn;
    	   lastname = ln;
    	   System.out.println("2 parametrize cons. "+firstname + lastname);
       }
	   public PersonCons(String fn,String ln,String add) {
		   this(fn,ln);
		   address = add;
		   System.out.println("3 parametrize cons. "+firstname +lastname +address);
	   }
       public void changeAddress() {
    	   System.out.println("change address bhopal to gwalior");
       }
	
	
	
}
