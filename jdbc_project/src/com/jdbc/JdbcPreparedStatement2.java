package com.jdbc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.*;
import java.util.Scanner;

class DbConnection {
	private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static void insertRecords() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String username = "root";
			String password = "abrark4961";
			String url = "jdbc:mysql://localhost:3306/student?useSSL=false";
			Connection con = DriverManager.getConnection(url, username, password);
			String q = "insert into College(clg_NAME,clg_ADDRESS) values (?,?)";
			PreparedStatement pstmt = con.prepareStatement(q);

			System.out.println("entre clg name...");
			String clg_name = br.readLine();
			System.out.println("entre clg Address...");
			String clg_Address = br.readLine();
			pstmt.setString(1, clg_name);
			pstmt.setString(2, clg_Address);
			pstmt.executeUpdate();

			System.out.println("insertd values....");
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void getFetchData() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String username = "root";
			String password = "abrark4961";
			String url = "jdbc:mysql://localhost:3306/student?useSSL=false";
			Connection con = DriverManager.getConnection(url, username, password);
			String q = "select * from College where Clg_NAME = ?";
			PreparedStatement pstmt = con.prepareStatement(q);

			System.out.println("entre clg id...");

			pstmt.setString(1,br.readLine());

			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				System.out.println(
						rs.getString("Clg_ID") + " " + rs.getString("Clg_NAME") + " " + rs.getString("clg_ADDRESS"));
			}
			System.out.println("fetch values....");
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void deleteRecords() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String username = "root";
			String password = "abrark4961";
			String url = "jdbc:mysql://localhost:3306/student?useSSL=false";
			Connection con = DriverManager.getConnection(url, username, password);
			String q = "delete from College where Clg_ID=?";
			PreparedStatement pstmt = con.prepareStatement(q);
			System.out.println("Enter Id for which you want to delete");
			pstmt.setString(1, br.readLine());
			pstmt.executeUpdate();
			System.out.println("deleted values....");
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void updateRecords() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String username = "root";
			String password = "abrark4961";
			String url = "jdbc:mysql://localhost:3306/student?useSSL=false";
			Connection con = DriverManager.getConnection(url, username, password);
			String q = "update college set Clg_NAME='abc',Clg_ADDRESS='mumbai' where Clg_ID=4";
			PreparedStatement pstmt = con.prepareStatement(q);
			pstmt.executeUpdate();
			System.out.println("updated values....");
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	static void autorun() throws IOException {
		System.out.println("Which  one you want to choose (h1/h)");
		String sc = br.readLine();
		switch (sc) {
		case "insert":
			DbConnection.insertRecords();
			break;
		case "update":
			DbConnection.updateRecords();
			break;
		case "delete":
			DbConnection.deleteRecords();
			break;
		case "fetch":
			DbConnection.getFetchData();
			break;
		}
		System.out.println("Do you want to run this program (y/n)");
		String choose = br.readLine();
		if (choose.equalsIgnoreCase("y")) {
			Testing.autorun();
		} else if (choose.equalsIgnoreCase("n")) {
			System.out.println("Thanks and Bye");
		}
	}

	public class JdbcPreparedStatement2 {

		public static void main(String[] args) throws IOException {
			DbConnection.autorun();

		}

	}
}
