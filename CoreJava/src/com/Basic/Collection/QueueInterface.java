package com.Basic.Collection;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueInterface {
	public static void main(String[]args) {
	
	//random ele.access
	//methods of queue >>> offer,poll,peek	
	Queue q = new PriorityQueue();
	q.offer(76);//next element as it is same data type 
	q.offer(7);
	q.add(70);
	q.add(99);
	q.add(98);
	System.out.println(q);
	q.poll();
	q.poll();
	//q.remove();
	
	System.out.println(q);	//follow fifo
	System.out.println("peek " +q.peek());
	System.out.println(q);
	
	System.out.println("peek 2nd " +q.peek());
	System.out.println(q.remove());
	System.out.println(q);
	
	//allow diff.element in linked list
	
	Queue qu = new LinkedList();//follow fifo
	qu.offer(89);
	qu.offer(86);
	qu.offer(7);
	qu.offer("kim");
	System.out.println(qu);
	qu.remove();
	qu.remove();
	qu.remove();
	//qu.remove();
	qu.poll();
	//qu.element();
	
	System.out.println(qu.peek());
	System.out.println(qu);
	
	
	}

}
