package com.emp;

class Overriding {
	void add(int a, int b) {
		System.out.println(a + " " + b);
	}

	void add(String a, String b, int c) {
		System.out.println(a + " " + b + " " + c);
	}
}

public class Overriding1 extends Overriding {
	public static void main(String[] args) {
		Overriding1 overriding1 = new Overriding1();
		overriding1.add("khan", "salman", 25);
	}
}
