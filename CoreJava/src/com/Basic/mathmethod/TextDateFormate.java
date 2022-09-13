package com.Basic.mathmethod;

import java.util.Date;
import java.text.SimpleDateFormat;

public class TextDateFormate {
	public static void main(String[]args)throws Exception {
		
		Date d = new Date();
		System.out.println(d);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/YYYY"); 
		String str = sdf.format(d);
		System.out.println(str);
		String str1 = "21/09/2019";
		Date d1 = sdf.parse(str1);
		System.out.println(d1);
		
		
		
		
		
		
		
		
	}

}
