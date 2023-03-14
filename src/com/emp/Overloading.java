package com.emp;

public class Overloading {
	static int add(int a,int b)
	{
		return a+b;
	}
	static int add(int a,int b,int c)
	{
		return a+b-c;
	}

	public static void main(String[] args) {
	Overloading overloading = new Overloading();
	//overloading.add("khan", "abrar");
	System.out.println(overloading.add(1, 2));
	}

}
