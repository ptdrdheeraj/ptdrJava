package com.in.advmarksheet;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Marksheetbean {

	private int Id;
	private String Rollno;
	private int Phy;
	private int Che;
	private int Mat;
	private String Tot;
	
	public String getTot() {
		return Tot;
	}
	public String setTot(String tot) {
		return Tot = tot;
	}
	public Marksheetbean() {}
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getRollno() {
		return Rollno;
	}
	public void setRollno(String rollno) {
		Rollno = rollno;
	}
	public int getPhy() {
		return Phy;
	}
	public void setPhy(int phy) {
		Phy = phy;
	}
	public int getChe() {
		return Che;
	}
	public void setChe(int che) {
		Che = che;
	}
	public int getMat() {
		return Mat;
	}
	public void setMat(int mat) {
		Mat = mat;
	}
	public int testnextpk() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Raystech","root","Sourabh@123");
		PreparedStatement ps = conn.prepareStatement("select max(id) from employee ");
		ResultSet rs = ps.executeQuery();
		int pk = 0;
		while (rs.next()) {
		pk = rs.getInt(1);
		}ps.close();
		rs.close();
		conn.close();
		return pk+1;
	}
	
}
