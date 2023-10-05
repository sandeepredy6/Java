package com.uno;

public class Polindrome {
	//Java String program to check whether a string is a Palindrome
	public static void main(String[] args) {
			String str = "123454321";
			String revStr = "";
			for(int i=str.length()-1;i>=0;i--){
				revStr = revStr + str.charAt(i);
			}
			if(str.contentEquals(revStr)) {
				System.out.println("String is Polyndrome");
			}
			else {
				System.out.println("String is Not  Polyndrome");
					
			}
}
}
