package com.uno;

public class charcount {

	public static void main(String []args ) {
		String str = "welcome to java world good morning";
		int eCount = 0;
		int oCount = 0;
		char ch;
		for (int i=0;i<str.length();i++) {
			ch=str.charAt(i);
			if(ch=='e') eCount+= 1 ;
			if(ch=='o') oCount+= 1 ;
			
			System.out.println("Occurance of e is "+eCount);
			System.out.println("Occurance of o is "+oCount);
		
		} 
	}
}
