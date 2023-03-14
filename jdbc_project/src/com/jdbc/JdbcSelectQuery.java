package com.jdbc;

import java.sql.*;


public class JdbcSelectQuery {

	public static void main(String[] args) {
		try {
		
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url="jbdc:mysql://localhost:3306/hostel?useSSL=false";
			String username="root";
			String password="abrark4961";
			Connection con=DriverManager.getConnection(url,username,password);
			String query="insert into student values(06,'khan','bsc.it','sy.it')";
			Statement stmt=con.createStatement();
			stmt.executeUpdate(query);
			System.out.println("created query....");
			con.close();
		} 
		catch (Exception e)
		{
		e.printStackTrace();	
		}
    
	}

}
