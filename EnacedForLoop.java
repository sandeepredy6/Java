package com.uno;

public class EnacedForLoop {

	public static void main(String[] args) {
		String [] names = {"jay", "yash", "bill","jay", "yash", "bill"};
		
		for( int i=0;i<6;i++) {
			System.out.println(names[i]);
		}
		System.out.println("...............................");
for(String name:names) {
System.out.println("hello " + name);
	}
	}
}
