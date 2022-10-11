package com.Basic.Collection;

import java.util.ArrayList;
import java.util.Iterator;

public class Generics {

	public static void main(String[] args) {
        //before generics need to type casting 
		ArrayList a = new ArrayList();
		a.add(34);
		a.add(45);
		Integer s = (Integer) a.get(1);
		System.out.println(a);

		Iterator it = a.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

		// after generics define
		ArrayList<String> b = new ArrayList<String>();
		b.add("bhumi");
		b.add("bhutta");
		b.add("ptdr");
		System.out.println(b);

		Iterator itr = b.iterator();
        while(itr.hasNext()) {
        	System.out.println(itr.next());//string
        }
	}
}
