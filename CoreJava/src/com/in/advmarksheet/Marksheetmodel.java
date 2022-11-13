package com.in.advmarksheet;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

public class Marksheetmodel {

	public void add(Marksheetbean bean) throws Exception {

		ResourceBundle rb = ResourceBundle.getBundle("com.in.advrb.app");//connection by resource bundle {app file}
		
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Raystech", "root", "Sourabh@123");
		conn.setAutoCommit(false);
		PreparedStatement ps = conn.prepareStatement("insert into marksheet1 values(?,?,?,?,?)");
		int a = bean.testnextpk();
		ps.setInt(1, a);
		ps.setString(2, bean.getRollno());
		ps.setInt(3, bean.getPhy());
		ps.setInt(4, bean.getChe());
		ps.setInt(5, bean.getMat());

		int i = ps.executeUpdate();
		System.out.println(i + " record updated");
		conn.commit();
		conn.close();
		ps.close();
		// rs.close();
	}

	public void update(String Tot) throws Exception {
		ResourceBundle rb = ResourceBundle.getBundle("com.in.advrb.app");//connection by resource bundle {app file}
		
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Raystech", "root", "Sourabh@123");
		conn.setAutoCommit(false);
		PreparedStatement ps = conn.prepareStatement("alter table marksheet1 drop column total ");
		//ps.setInt(1,24);

		int i = ps.executeUpdate();
		System.out.println(i + "updated");
		conn.commit();
		conn.close();
		ps.close();
	}

	public void delete(Marksheetbean bean) throws Exception {

		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Raystech", "root", "Sourabh@123");
		conn.setAutoCommit(false);
		PreparedStatement ps = conn.prepareStatement("delete  from marksheet1 where id = ?");
		ps.setInt(1, bean.getId());
		int i = ps.executeUpdate();
		System.out.println(i + "deleted");
		conn.commit();
		conn.close();
		ps.close();

	}

	public Marksheetbean getbyId(int Id) throws Exception {

		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Raystech", "root", "Sourabh@123");
		Marksheetbean bean = null;
		conn.setAutoCommit(false);
		PreparedStatement ps = conn.prepareStatement("select * from marksheet1 where id = ?");
		ps.setInt(1, Id);
		ResultSet rs = ps.executeQuery();

		while (rs.next()) {
			bean = new Marksheetbean();

			bean.setId(rs.getInt(1));
			bean.setRollno(rs.getString(2));
			bean.setPhy(rs.getInt(3));
			bean.setChe(rs.getInt(4));
			bean.setMat(rs.getInt(5));
		}

		conn.commit();
		conn.close();
		ps.close();
		return bean;

	}

	public List<Marksheetbean> getMeritList() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Raystech", "root", "Sourabh@123");
		Marksheetbean bean = null;
		conn.setAutoCommit(false);
		PreparedStatement ps = conn.prepareStatement("select *, (Phy+Che+Mat) as marks  from marksheet1  order by marks desc limit 3");
		
		ArrayList list = new ArrayList();

		ResultSet rs = ps.executeQuery();
		while (rs.next()) {
			bean = new Marksheetbean();
			bean.setId(rs.getInt(1));
			bean.setRollno(rs.getString(2));
			bean.setPhy(rs.getInt(3));
			bean.setChe(rs.getInt(4));
			bean.setMat(rs.getInt(5));
			list.add(bean);

			
		}
		return list;
	}
   public Marksheetbean search(String Rollno) throws Exception {
	    Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Raystech", "root", "Sourabh@123");
		Marksheetbean bean = null;
		
		conn.setAutoCommit(false);
		PreparedStatement ps = conn.prepareStatement("select * from marksheet1 where Rollno like (?)");
		ps.setString(1, Rollno);
		ResultSet rs = ps.executeQuery();
		while (rs.next()) {
			bean = new Marksheetbean();
			bean.setId(rs.getInt(1));
			bean.setRollno(rs.getString(2));
			bean.setPhy(rs.getInt(3));
			bean.setChe(rs.getInt(4));
			bean.setMat(rs.getInt(5));
			
		}conn.commit();
		conn.close();
		ps.close();
		
		return bean;
   }






	
	
	
}
