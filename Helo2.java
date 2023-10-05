package com.uno;

public class Helo2 {
	//How to reverse a string in Java without using the reverse method?
	public static void main(String[] args) {
	String str = "123456789";
	
	String res = "";
	
	for(int i=str.length()-1;i>=0;i--) {
		res = res +str.charAt(i);
	}
	System.out.print(res);
}}