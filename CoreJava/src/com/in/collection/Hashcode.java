package com.Basic.Collection;

import java.util.ArrayList;

public class Hashcode {
	
	public static void main(String[]args) {
		
	
	 ArrayList list = new ArrayList();
	 list.add(50);
	 ArrayList list1 = new ArrayList();
	 list1.add(90);
	//two diff.object
	 
	System.out.println(list.hashCode());
	System.out.println(list1.hashCode());

}
}