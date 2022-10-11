package com.Basic.Collection;

import java.util.Comparator;

public class SortByLname implements Comparator<Marksheet>{

	
	@Override
	public int compare(Marksheet o1, Marksheet o2) {
		if(o1.getName()==o2.getName()) {
			System.out.println("first");
		return o1.getLname().compareTo(o2.getLname());}
		
		else {
			System.out.println("second");
			return o1.getName().compareTo(o2.getName());}
	}

	
	
	
	

}
