package com.uno;

public class uppertolower {

	public static void main(String[] args) {
		char ch='D';
		// a--97
		// A--65+32--97
		System.out.println("Before conversion");
		
		System.out.println(ch);
		
		ch = (char)(ch + 32);
		System.out.println("After conversion");
		
		System.out.println(ch);

	}

}
