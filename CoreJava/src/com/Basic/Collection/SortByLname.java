package com.Basic.Collection;

import java.util.Comparator;

public class SortByLname implements Comparator<Marksheet>{

	
	@Override
	public int compare(Marksheet o1, Marksheet o2) {
		
		return o2.getLname().compareTo(o1.getLname());
	}

	
	
	
	

}
