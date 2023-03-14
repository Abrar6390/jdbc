package com.jdbc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;
//resultsetmetadata
//colebal

class DbFetch {
	public static void insertRecords() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String username = "root";
			String password = "abrark4961";
			String url = "jdbc:mysql://localhost:3306/centre?useSSL=false";
			Connection con = DriverManager.getConnection(url, username, password);
			String q = "insert into employee(emp_name,emp_gender,emp_age) values (?,?,?)";
			PreparedStatement pstmt = con.prepareStatement(q);

			pstmt.setString(1, "Arhan");
			pstmt.setString(2, "male");
			pstmt.setString(3, "18");
			pstmt.executeUpdate();

			System.out.println("insertd values....");
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void updateRecord() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String username = "root";
			String password = "abrark4961";
			String url = "jdbc:mysql://localhost:3306/centre?useSSL=false";
			Connection con = DriverManager.getConnection(url, username, password);
			String q = "update employee set emp_gender='M' where id=3";
			PreparedStatement pstmt = con.prepareStatement(q);
			
			pstmt.executeUpdate();

			System.out.println("updated....");
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void getFetchRecods() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String username = "root";
			String password = "abrark4961";
			String url = "jdbc:mysql://localhost:3306/centre?useSSL=false";
			Connection con = DriverManager.getConnection(url, username, password);
			String q = "select * from employee where emp_gender=?";
			PreparedStatement pstmt = con.prepareStatement(q);
			Scanner sc=new Scanner(System.in);
			System.out.println("entre emp_age.. ");
			pstmt.setInt(1,sc.nextInt());
			ResultSet rs=pstmt.executeQuery();
           while (rs.next()) {
			System.out.println(rs.getString("id")+" "+rs.getString("emp_name")+" "+rs.getString("emp_gender")+" "+rs.getString("emp_age"));
			
		}
			System.out.println("fetched...");
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

public class FetchValueJdbc {

	public static void main(String[] args) {
		//System.out.println("inserted...");
		//DbFetch.insertRecords();
		
       //System.out.println("updated....");
       //DbFetch.updateRecord();
       
       System.out.println("fetch...");
       DbFetch.getFetchRecods();
	}

}
