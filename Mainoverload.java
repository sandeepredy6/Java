package com.uno;

public class Mainoverload {
	// is main method will have overloaded 

		public static void main(String[] args) {
			System.out.println("Book1");
			main();
			int[] x= {};
			main(x);
			char[] y= {};
			main(y);
			main(10,20);
			
		}

		public static void main() {
			System.out.println("Book2");
				
		}
		public static void main(int[] args) {
			
			System.out.println("Book3");
		}
		public static void main(char[] args) {
			System.out.println("Book4");
			
		}
		public static void main(int a,int b) {
			
			System.out.println("Book5");
		}
	}

