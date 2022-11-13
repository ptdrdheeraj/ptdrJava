package com.Basic.Collection;



import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.SortedSet;
import java.util.TreeSet;

public class Set {
	public static void main(String[]args) {
		//allow different data type
		//random print
	    HashSet s = new HashSet();
		
		s.add('j');
		s.add(56);
	
		s.add(7.8);
		s.add(90);
		System.out.println(s);
		
		System.out.println();
		
		//allow diff.data type
		//insertion order(Same)
		LinkedHashSet l = new LinkedHashSet();
		l.add(87);
		l.add(5);
		l.add('j');
		l.add("java");
		l.add("java");//duplicate not allow in set interface
		System.out.println(l);
		l.addAll(s);
		System.out.println(l);
		
		//not allow diff.data type
		//ascending order
		TreeSet t = new TreeSet();
		t.add(578);
		t.add(563);
		t.add(89);
		t.add(8);
		System.out.println(t);
		
		//not allow diff.data type
		//ascending order
		SortedSet o =  new TreeSet();
		o.add("one");
		o.add("two");
		o.add("three");
		o.add("four");
		System.out.println("collection o "+o);
		for(Object ob:o)
		System.out.println(ob);
		
		System.out.println("first "+o.first());
		System.out.println("last "+o.last());
		System.out.println("Headset "+o.headSet("three"));//print ele. before object
		System.out.println("tailset "+o.tailSet("three"));//print ele. after obj.include ob.
		System.out.println("subset "+o.subSet( "four","two"));//last obj.not include 
		
		
	}

}
