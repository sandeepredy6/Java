package ownPractice;

public class Conversion {

	public static void main(String[] args) {
		// * Given an unsigned integer, swap all 0 bits with 1 bitsand 1 bit to 0. For example, 
		// * if the given number is 23 (10111),
	//	 * then 1000---8
		 
				int n =9,r,p=1,bn=0,res =0,p2=1;
				
				while( n != 0) {
					r = n % 2;
					 n= n / 2;
					 if( r == 0) r=1;
					 else if(r==1) r=0;
					 res = res + r * p2;
					 bn = bn +r * p;
					 p = p * 10;
					 p2 = p2 * 2;
				}
				System.out.println("Binar number--->"+bn);
				System.out.println("Result --->"+res);
			}

		
		}

	
