package com.Basic.Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class TestMarksheet {
	
	public static void main(String[] args) {
		
		
		Marksheet m1  = new Marksheet();
		m1.setRollno(5);
		m1.setName("Ram");
		m1.setLname("gupta");
		m1.setPhy(98);
		m1.setChe(78);
		m1.setMath(65);
		
		Marksheet m2 = new Marksheet();
		m2.setRollno(4);
		m2.setName("Ram");
		m2.setLname("gurjar");
		m2.setPhy(28);
		m2.setChe(68);
		m2.setMath(67);
		
		Marksheet m3 = new Marksheet();
		m3.setRollno(2);
		m3.setName("Ram");
		m3.setLname("kushwah");
		m3.setPhy(88);
		m3.setChe(38);
		m3.setMath(61);
		
		ArrayList list = new ArrayList();
		list.add(m1);
		list.add(m2);
		list.add(m3);
		
		//if(m1.getName()== m2.getName() && m2.getName()== m3.getName()) 
		//{Collections.sort(list,new SortByLname());}//(list,class name)
		//else {Collections.sort(list,new SortByFname());}
		Collections.sort(list,new SortByLname());//reveese object for descending order
		Iterator it  = list.iterator();
		while(it.hasNext()) {
			Marksheet m =(Marksheet)it.next();
			
		System.out.println(m.getRollno()+" "+m.getName()+" "+m.getLname()+
				" "+m.getPhy()+" "+m.getChe()+" "+m.getMath());}
		
			
		
		
		
		
	}
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


