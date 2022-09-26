package com.in.dataabstract;

public class Employee extends PersonCons {
	
	  private String designation;
	   
	  public Employee() {
		  super();//is equal to = if remove super()then automatic parents cons.called. 
		  System.out.println("Default cons.1");
	  }
	  public Employee(String fn,String ln,String des) {
		  super(fn,ln);
		  designation = des;
		  System.out.println("3 Parametrize cons. "+ firstname+ lastname + designation); 
		  
	  }
	  public void changeaddress() {
		  super.changeAddress();
		  System.out.println("change indore in place of bhopal");
		  System.out.println("Employee address ");
	  }
	
	
	
}
	


