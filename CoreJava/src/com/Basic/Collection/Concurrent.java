package com.Basic.Collection;

import java.util.Iterator;
import java.util.concurrent.LinkedBlockingDeque;

public class Concurrent {
	public static void main(String[] args) {
		
		LinkedBlockingDeque list = new LinkedBlockingDeque();//key class of blocking Deque interface
		//concurrent collection allow multiple user access 
		//because it lock's only one ele.in list(read ray's tutorials)
		list.add(34);
		list.add(23);
		
		Iterator it = list.iterator();
		list.add(45);
		list.add("jay");
		while(it.hasNext()) {
			Object O = it.next();
			System.out.println(O);}
		
		
		
		
		
	}

}
