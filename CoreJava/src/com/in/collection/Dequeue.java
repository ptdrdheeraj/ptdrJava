package com.Basic.Collection;

import java.util.ArrayDeque;
import java.util.Deque;

public class Dequeue {
	public static void main (String[]args) {
		
		Deque d = new ArrayDeque();//double ended queue
		d.offer(35);
		d.add(5.5);
		d.add('d');
		//d.add(5657);
		System.out.println(d);
		d.pollFirst();//first and last ele.in queue method operation 
		System.out.println("pollFirst "+d);
		System.out.println(d.peekFirst());
		d.pollLast();
		System.out.println("pollLast "+d);
		d.pollFirst();
		System.out.println(d);
		System.out.println(d.peek());
		
		
	}

}
