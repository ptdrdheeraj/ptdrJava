package com.Basic.Collection;

import java.util.ArrayList;
import java.util.Vector;
import java.util.Vector;
public class Instantiate {
	
	public static void main (String []args) {
		
		Vector v = new Vector();		
        Vector vct = new Vector(20);
        Vector vtr = new Vector();
		vtr.add(5);
		vtr.add(50);
		vtr.add(5);
		vtr.add(5);
		vtr.add(50);
		vtr.add(5);
		
		Integer i = new Integer(90);
		vtr.add(i);
		Integer valus = (Integer)vtr.get(6);

		System.out.println("vl."+valus);
		System.out.println(vct.capacity());
	    System.out.println(vtr.capacity());
		
		ArrayList a = new ArrayList();
		ArrayList ar = new ArrayList();
		ArrayList al = new ArrayList();
		
		ar.add(40);
		ar.add(40);
		ar.add(49);
		
		System.out.println(ar.size());
		
		
		
	}

}
