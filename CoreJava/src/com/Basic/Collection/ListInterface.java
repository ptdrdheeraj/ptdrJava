package com.Basic.Collection;

import java.util.ArrayList;

import java.util.List;
import java.util.Vector;

public class ListInterface {
	
	public static void main(String[]args) {
		
		List li = new ArrayList();
		li.add(2);
		li.add(5);
		li.add("Vijju");
		li.add('a');
		
		System.out.println(li);
		List lst = new Vector();
		lst.add(2);
		lst.add("List");
		lst.add(5);	
		lst.retainAll(li);
		System.out.println(lst);
		
		
	}
	
	
	
	
	

}
