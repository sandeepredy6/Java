package OwnPractice;

public class NconversIonssss {

	public static void main(String[] args) {
		// 9 --- 1001
				// 0 --0
				// 1--1
				// 2 ---10
				// 3 ---11
				// 4 ---100
				// 5 ---101
				//
				
				int n =23,r,p=1,bn=0;
				
				while( n != 0) {
					r = n % 2;
					 n= n / 2;
					 bn = bn +r * p;
					 p = p * 10;
				}
				
				System.out.println("Binar number--->"+bn);
			}


}
