package com.jdbc;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

import javax.swing.text.AbstractDocument.BranchElement;

public class BufferReaderProgram {

	public static void insertedRecods() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/centre?useSSL=false";
			String username = "root";
			String password = "abrark4961";
			Connection con = DriverManager.getConnection(url, username, password);
			String q = "insert into student(name,age,phone_no,isActive) values(?,?,?,?)";
			PreparedStatement pstmt = con.prepareStatement(q);
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("entre name");
			String name = br.readLine();
			System.out.println("entre age");
			String age = br.readLine();
			System.out.println("entre Phone no...");
			String phnoe_no = br.readLine();
			System.out.println("entre isActive...");
			String isActive = br.readLine();
			pstmt.setString(1, name);
			pstmt.setString(2, age);
			pstmt.setString(3, phnoe_no);
			pstmt.setString(4, isActive);
			pstmt.executeUpdate();
			System.out.println("insertd");

			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		do {
			BufferReaderProgram.insertedRecods();
			Scanner sc = new Scanner(System.in);
			System.out.println("what do you want run prgram again? (y/n)");
			String str = sc.next();
			
			if (str.equalsIgnoreCase("y")) {
				BufferReaderProgram.insertedRecods();
			} else {
				System.out.println("thnks....");
			}
		} while (false);
        
	}
}


