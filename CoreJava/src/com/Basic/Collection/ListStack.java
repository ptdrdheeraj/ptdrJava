package com.Basic.Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Stack;

public class ListStack {
	
	public static void main(String[]args) {
		
		Stack s = new Stack();
		s.add(2);
		s.add(6.5);
		s.add('d');
		s.add("sout");
		
		System.out.println(s);
		
		Stack st = new Stack();
		st.add(2);
		st.add("sdfg");
		st.add(st);
		
		System.out.println(st.size());
		//method of stack
		Stack sk = new Stack();
		sk.push(2);
		sk.push(5.8);
		sk.push('h');
		sk.push("sky");
		sk.pop();
		sk.pop();
		System.out.println(sk.peek());
		
		ArrayList a = new ArrayList();
		a.add("jay");
		a.add("jaya kumari");
		//a.add("patel");
		
		Iterator it = a.iterator();
		while(it.hasNext()) {
		Object o = it.next();// next method print value
		System.out.println(o);
			
			
		}
		
		
		
	}
	
	

}
