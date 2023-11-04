package com.uno;

public class Factorial {

static long fact(int n){// 1
		
		if(n == 1 ) return 1;
		else  return n * fact(n-1);// 8 * 7* 6 * 5 *4 * 3 * 2 * 1
		//fact(7)--->7* 6 * 5 *4 * 3 * 2 * 1
		//fact(6)---> 6 *5 *4 * 3 * 2 * 1
		//fact(5)---> 5 *4 * 3 * 2 * 1
		// fact(4)---> 4 * 3 * 2 * 1
		// fact(3)---> 3 * 2 * 1
		// fact(2)---> 2 * fact(1)
		// fact(1)--->1
	}
	
	public static void main(String[] args) {
	
	// recursion
		
		int n =7;// 8!---8 * 7 * 6 * 5 * 4 * 3 * 2 * 1---
		System.out.println("res----->"+fact(n));
		
	}

}