package com.uno;

public class LastRepeatedstr {

	public static void main(String[] args) {
		
		 String str = "10339093414";
		 // 
		 // 
		 // last repeated number 
		 char[] strArr = str.toCharArray();
		 char eachChar;
		 boolean isFound = false;
		 char lastrepeatedchar=' ';
		 for(int i=0;i<strArr.length;i++) {
			 eachChar = strArr[i];
			 isFound = false;
			for(int j=i+1;j<strArr.length;j++) {
				if(eachChar == strArr[j]) {
					isFound = true;
					break;
				}// if
			}// for j
			if(isFound == true) {
				lastrepeatedchar=eachChar;
			}// if
		 }// for i
	
		 System.out.println("last Repeated Char--->"+lastrepeatedchar);
	
	}

}