package ownPractice;

public class BinaryToNum {

		public static void main(String[] args) {
		int n =20,r;
		int[] bn = new int[8];
		int index=7;
		while( n != 0) {
		
			 r = n % 2;
			 n= n / 2;
			 bn[index--] = r;
		}
		for(int i=0;i<8;i++) {
			System.out.print(bn[i]);
		}
		int b=0;
		String res = "";
		// 00010111
		for(int i=0;i<8;i++) {
			if(i % 2 == 0) {
				res = res + bn[i+1];
			}
			else {
				res = res + bn[i-1];
			}
		}// for
		System.out.println("\n result ---->"+res);
	
	}

}