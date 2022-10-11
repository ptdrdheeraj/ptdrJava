package com.Basic.Collection;

import java.util.ArrayList;

import java.util.List;
import java.util.Vector;

public class ListInterface {
	
	public static void main(String[]args) {
		//List method
		List li = new ArrayList();
		li.add(2);
		li.add(5);
		li.add("Vijju");
		li.add('a');
		li.add('a');
		
		//li.add(3, "patel");
        // System.out.println(li.get(0));
		//li.remove(2);
		//li.set(1, 2);
		//System.out.println(li.subList(1,3));
		//System.out.println(li.indexOf("Vijju"));
		
		//collection method
		li.addAll(li);
		System.out.println(li);
		System.out.println(li.lastIndexOf("Vijju"));
		
		List lst = new Vector();
		lst.add(2);
		lst.add("List");
		lst.add(5);	
		
		System.out.println(lst);
	
		lst.retainAll(li);//same ele.retained in both collection
		System.out.println(lst);
		
		
		System.out.println("contain "+lst.contains(5));//check object
		
		System.out.println("containall "+lst.containsAll(lst));//collection
		System.out.println("isimpty "+lst.isEmpty());
		
		lst.add("second list");
		System.out.println(lst);
		
		lst.remove(1);
		System.out.println("remove index "+lst);
		
		lst.removeAll(lst);
		System.out.println("removeAll "+lst);
		
		lst.clear();
		System.out.println("clear "+lst);
		
		
		
		
	}
	
	
	
	
	

}
