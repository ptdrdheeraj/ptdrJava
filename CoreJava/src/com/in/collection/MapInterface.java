package com.Basic.Collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

public class MapInterface {
	public static void main(String[]args) {
		
		Map m  = new HashMap();
		m.put( "java",1);
		m.put( "Python",2);
		m.put( "C++",3);
		System.out.println(m);
		System.out.println("containsKey "+m.containsKey("1"));
		System.out.println("containsValue "+m.containsValue(2));
		System.out.println("get "+m.get("java"));
        System.out.println("keySet "+m.keySet());
        System.out.println("entrySet "+m.entrySet());
        System.out.println("remove "+m.remove("java"));
		System.out.println("entryset "+m.entrySet());
		System.out.println("values "+m.values());
		System.out.println(m.isEmpty());
		m.put( "C",4);
		System.out.println(m);
		System.out.println("size "+m.size());
		
		Set key =  m.keySet();
		for(Object k:key)
		System.out.println(k+"= "+m.get(k));
		
	     Integer i =   (Integer) m.get("C");
		System.out.println(i);
		
		SortedMap mp = new TreeMap();
		mp.put("1", "hindi");
		mp.put("2", "english");
		for(Object O :mp.keySet())
		System.out.println(O+" = "+mp.get(O));
		
        
		
		
		
	}

}
