package com.uno;

public class BeforeAfter1 {
	public static void main(String[] args) {
		String str1 = "Car";
		String str2 = "Buss";
		String t;//temp variable

		System.out.println("Before Swapping");
		System.out.println("STR1---->"+str1);
		System.out.println("STR2---->"+str2);
		
		
		t = str1;
		str1=str2;
		str2=t;
		System.out.println("After Swapping");
		
		System.out.println("STR1---->"+str1);
		System.out.println("STR2---->"+str2);
		
		
		
		
	}
}
