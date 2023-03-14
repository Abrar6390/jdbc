package com.jdbc;

import java.net.http.HttpResponse.BodySubscriber;
import java.sql.*;

public class JdbcFirQuery1 {

	public static void main(String[] args) {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url="jdbc:mysql://localhost:3306/company?useSSL=false";
			String username="root";
			String password="abrark4961";
			Connection con = DriverManager.getConnection(url,username,password);
			String query=("insert into student values(01,'Abrar','Bsc.it','sy.it')");
			String query1=("insert into student values(02,'khan','bsc.it','sy.it')");
			String query2=("insert into student values(03,'khan Abrar','bsc.it','sy.it')");
			
			Statement stmt = con.createStatement();
			
			stmt.executeUpdate(query);
			stmt.executeUpdate(query2);
			stmt.executeUpdate(query1);
			
			System.out.println("created query");
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
