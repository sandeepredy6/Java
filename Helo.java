package com.uno;

public class Helo {
	//How to reverse a string in Java without using the reverse method?
	public static void main(String[] args) {		
			String str = "123456789";
			
			char[] charArry = str.toCharArray();
			String res = " ";
			
			for(int i=charArry.length-1;i>=0;i--) {
				res = res +charArry[i];
			}
			System.out.print(res);
}
}