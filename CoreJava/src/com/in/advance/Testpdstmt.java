package com.in.advance;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Testpdstmt {

	public static void main(String[] args) throws Exception {
		//testadd();
		//testGetbyId(2);
		testSelect();
		//testnextpk();
		//int i = testnextpk();
		//System.out.println(i);
	}

	public static int testnextpk() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Raystech","root","Sourabh@123");
		PreparedStatement ps = conn.prepareStatement("select max(id) from emp ");
		ResultSet rs = ps.executeQuery();
		int pk = 0;
		while (rs.next()) {
		pk = rs.getInt(1);
		}ps.close();
		rs.close();
		conn.close();
		return pk+1;
	}
		
	

	private static void testSelect() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Raystech","root","Sourabh@123");
		//int dep_id =2;
		PreparedStatement ps = conn.prepareStatement("select * from marksheet1");
		//ps.setInt(1,dep_id);
		ResultSet rs = ps.executeQuery();
		
		while (rs.next()) {
			System.out.print("\t" + rs.getString(1));// column index
			System.out.print("\t" + rs.getString(2));// by using column name
			System.out.print("\t" + rs.getString(3));
			System.out.print("\t" + rs.getString(4));
			System.out.print("\t" + rs.getString(5));
			System.out.println("\t" + rs.getString(6));
		}ps.close();
			rs.close();
			conn.close();
		}
	

	public static void testGetbyId(int id) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Raystech", "root", "Sourabh@123");
		PreparedStatement ps= conn.prepareStatement("select * from emp where id =?");
		ps.setInt(1,id);
		ResultSet rs = ps.executeQuery();
	
		while (rs.next()) {
			System.out.print("\t" + rs.getString(1));// column index
			System.out.print("\t" + rs.getString("fname"));// by using column name
			System.out.print("\t" + rs.getString(3));
			System.out.print("\t" + rs.getString(4));
			System.out.print("\t" + rs.getString(5));
			System.out.println("\t" + rs.getString(6));
		
	}
		ps.close();
		rs.close();
		conn.close();
	}
		


	public static void testadd() throws Exception{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/Raystech","root","Sourabh@123");
	    int id =testnextpk();
		String fname = "Chetu";
		String lname = "verma";
		String address = "Sendhwa";
		int salary = 3478;
		int dep_id= 7;
		
		
		PreparedStatement ps= conn.prepareStatement("insert into emp values(?,?,?,?,?,?)");
		ps.setInt(1,id);
		ps.setString(2,fname);
		ps.setString(3,lname);
		ps.setString(4,address);

		ps.setInt(5,salary);
		ps.setInt(6,dep_id);
		int i=ps.executeUpdate();
		System.out.println(i +"  record updated");
	
    conn.close();
    ps.close();}
}
