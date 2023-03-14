package com.Abrar;

import java.util.Scanner;

public class EvenOddNumberSum {
	static Scanner sca=new Scanner(System.in);
	public static void main(String[] args) {
		int evenSum=0;
		int oddSum=0;
		 char choice = 0;
		do {
			System.out.println("entre the number");
			int num=sca.nextInt();
			if(num%2==0)
			{
				evenSum=evenSum+num;
				
			}
			else {
				 oddSum=oddSum+num;
			     }
			System.out.println("choice your option(y/n)");
			choice=sca.next().charAt(0);
		}
		while (choice=='y' | choice=='Y' );
		System.out.println(evenSum+"even sum number.....");
		System.out.println(oddSum+"odd sum number.....");
		System.out.println("thnks");
	}
	
	}

