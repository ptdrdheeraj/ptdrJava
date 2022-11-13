package com.Basic.Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;

import java.util.Vector;

public class Synchronous {

	public static void main(String[] args) {
		
		ArrayList a = new ArrayList();
		a.add(26);
		a.add("hello");
		a.add('k');
		System.out.println(a);
		Collection  it =  Collections.synchronizedList(a);
	    for(Object k:it) {
			System.out.println(k);}
	    
	    Vector v = new Vector();
		v.add(45);
		v.add(67);

		Enumeration en = v.elements();
		v.add(34);
		//v.remove(1);
		
		while (en.hasMoreElements()) {
			System.out.println(en.nextElement());
		}
		//System.out.println(v);// after enu.we can add through historical class
	    Vector b = new Vector();
	    b.add(98);
		b.add("hello hyy");
		
	    Iterator itr = b.iterator();
		b.add("kaka");//fail-fast
		
		  while(itr.hasNext()) {
        	System.out.println(itr.next());
		
		}
			
		

		
		
	}

}
