package com.jdbc;

import java.util.Scanner;

public class Testing {
	static Scanner scanner = new Scanner(System.in);

	static void h() {
		System.out.println("Hi");
	}

	static void h1() {
		System.out.println("HHHH");
	}

	static void autorun() {
		System.out.println("Which  one you want to choose (h1/h)");
		String sc = scanner.next();
		switch (sc) {
		case "h1":
			Testing.h();
			break;
		case "h":
			Testing.h1();
			break;
		}
		System.out.println("Do you want to run this program (y/n)");
		String choose = scanner.next();
		if (choose.equalsIgnoreCase("y")) {
			Testing.autorun();
		} else if (choose.equalsIgnoreCase("n")) {
			System.out.println("Thanks and Bye");
		}
	}

	public static void main(String[] args) {
		Testing.autorun();
	}
}