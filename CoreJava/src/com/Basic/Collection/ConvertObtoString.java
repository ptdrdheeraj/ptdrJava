package com.Basic.Collection;

import java.util.ArrayList;
import java.util.Iterator;

public class ConvertObtoString {
	 public static void main(String[]args) {
		
		 ArrayList a = new ArrayList();
		 a.add("Rohit");
		 a.add("Patel");
		 a.add(10);
		 
		 for(int i = 0;i<a.size();i++) {
			 System.out.println(i+"= "+a.get(i));//as a object
			 
		 }
		
		 System.out.println(a.toString());//convert obj.to string
		 
		 Iterator it = a.iterator();
		 while(it.hasNext()) {
			 Object o = it.next();//objectlist
			 System.out.println(o);
		 }
		 
	}

}
