package com.uno;

public class BeforeAfterSubstring {
	public static void main(String[] args) {
		String str1 = "Welcome";
		String str2 = "Hello";
		String t;  // temp variable 
		
		

		System.out.println("Before Swapping");
		System.out.println("STR1---->"+str1);
		System.out.println("STR2---->"+str2);
		
		
		str1 = str1 + str2;// "Welcome"+"Hello"="WelcomeHello"
		str2 = str1.substring(0, str1.length()-str2.length());//"Welcome"
		str1=  str1.substring(str2.length());
		
					
		System.out.println("After Swapping");
		System.out.println("STR1---->"+str1);
		System.out.println("STR2---->"+str2);
		
	}
}
