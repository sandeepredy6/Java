package com.uno;

public class Armstrong {

	public static void main(String[] args) {
		
		int n=153,id,sum=0,
		t=n;
		
		while (n!=0) {
			id =n % 10;
			n= n / 10;		
			sum= sum+id*id*id;
			if(sum == t) {
			 System.out.println("true");
		}
			else {
				System.out.println("false");
			}
		
				
		}
				
	}

}
