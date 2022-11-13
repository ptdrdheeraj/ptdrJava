package com.in.advance;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Types;

public class Teststfunction {
	public static void main(String[] args) throws Exception {
		teststf();
	}

	public static void teststf() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Raystech", "root", "Sourabh@123");
		CallableStatement col = conn.prepareCall("{?=CALL EmpFun(?)}");
		col.registerOutParameter(1, Types.INTEGER);
		//col.setInt(2, 3);
		//col.setString(1, "Ramesh");
		col.execute();
		System.out.println("count " + col.getInt(1));
		conn.close();
		col.close();
	}
}
