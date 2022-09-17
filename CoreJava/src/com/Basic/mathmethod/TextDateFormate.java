package com.Basic.mathmethod;

import java.util.*;
import java.text.SimpleDateFormat;

public class TextDateFormate {
	public static void main(String[] args) throws Exception {

		Date d = new Date();
		System.out.println(d);

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		String str = sdf.format(d);
	    System.out.println(str);

		String str1 = "23/09/2010";
		Date d1 = sdf.parse(str1);
		System.out.print(d1);

	}

}
