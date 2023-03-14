package com.jdbc.test.sahil;

public class RightRotation {
	
	public static void main(String args[]) {
		
		int[] a = {1,2,3,4,5};
		int b =a.length-1;
		int c=0;
		
		for(int i=0; i<=1;i++) {
			 c = a[i];
			a[i] = a[b];
			a[b] = c;
		}
		
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
		
		
	}
	

}
