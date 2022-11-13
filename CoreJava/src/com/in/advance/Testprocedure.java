package com.in.advance;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Types;

public class Testprocedure {
	public static void main(String[] args) throws Exception {
		teststp();
	}

	public static void teststp() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Raystech","root","Sourabh@123");
		CallableStatement col = conn.prepareCall("{CALL empcounts(?,?,?)}");
		col.setInt(1,5);//1=colomn ki 3rd row; 
		
		col.registerOutParameter(2, Types.VARCHAR);
		col.registerOutParameter(3, Types.VARCHAR);//reg.2nd paramtr like ?
		col.execute();
		System.out.print(col.getString(2));
		System.out.println(" "+col.getString(3));//second paramtr like ?
	    conn.close();
		col.close();
	}

}
