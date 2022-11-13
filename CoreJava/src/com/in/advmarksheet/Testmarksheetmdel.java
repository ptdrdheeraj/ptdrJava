package com.in.advmarksheet;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.ResourceBundle;

public class Testmarksheetmdel {
	public static void main(String[] args) throws Exception {

		//testadd();
		//testupdate();
		//testdelete();
        //testget();
        //testGetMeritList();
		//testsearch();
		testrb();
	}

	public static void testrb() {
		ResourceBundle rb = ResourceBundle.getBundle("com.in.advrb.app",new Locale("hi"));
		System.out.println(rb.getString("greeting"));
		
	}

	public static void testsearch() throws Exception {
		Marksheetmodel model = new Marksheetmodel();
		Marksheetbean bean = model.search("%105");
		System.out.print("\t"+bean.getId());
		System.out.print("\t"+bean.getRollno());
		System.out.print("\t"+bean.getPhy());
		System.out.print("\t"+bean.getChe());
		System.out.println("\t"+bean.getMat());
	
		
	}

	public static void testGetMeritList() throws Exception {
		Marksheetmodel model = new Marksheetmodel();
		
		List list =model.getMeritList();
		Marksheetbean bean = null;
		Iterator it = list.iterator();
		while(it.hasNext()) {
			 bean = (Marksheetbean) it.next();
			System.out.print(bean.getId());
			System.out.print(bean.getRollno());
			System.out.print(bean.getPhy());
			System.out.print(bean.getChe());
			System.out.println(bean.getMat());
		}
		
		
	}

	public static void testget() throws Exception {
		Marksheetmodel model = new Marksheetmodel();
		Marksheetbean bean =model.getbyId(2); 
		
		System.out.print("\t"+bean.getId());
		System.out.print("\t"+bean.getRollno());
		System.out.print("\t"+bean.getPhy());
		System.out.print("\t"+bean.getChe());
		System.out.println("\t"+bean.getMat());
	}

	public static void testdelete() throws Exception {
		Marksheetbean bean = new Marksheetbean();
		Marksheetmodel model = new Marksheetmodel();
		bean.setId(3);
		
		
		model.delete(bean);
		
	}

	public static void testupdate() throws Exception {
		Marksheetbean bean = new Marksheetbean();
		Marksheetmodel model = new Marksheetmodel();
		model.update(bean.setTot("percent"));
	}

	public static void testadd() throws Exception {

		Marksheetbean bean = new Marksheetbean();
		bean.setRollno("rays102");
		bean.setPhy(71);
		bean.setChe(81);
		bean.setMat(90);

		Marksheetmodel model = new Marksheetmodel();
		model.add(bean);
	}

}
