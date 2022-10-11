package com.Basic.Collection;

import java.util.Comparator;

public class SortByFname implements Comparator<Marksheet>{

	@Override
	public int compare(Marksheet o1, Marksheet o2) {
		
		return o1.getName().compareTo(o2.getName());
	}
	
	

}
