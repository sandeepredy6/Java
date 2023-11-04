package com.uno;

public class BreakProgram {

	public static void main(String[] args) {
		int number1 = 20;
		int number2 = 3;
		char operation = '*';
		int result = 0;
		
		switch(operation) {
		case '+' :
			result = number1 + number2;
			break;
		case '-' :
			result = number1 - number2;
			break;
		case '*' :
			result = number1 * number2;
			break;
		default :
			result = 0;
		
	}
System.out.println("\n result = " + (result));
}
}