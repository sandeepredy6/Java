package com.uno;


	// over loaded


	class Dummy{
		
		void add(int a, int b) {
			System.out.println(a+b);
		}
		void add(int a, int b,int c) {
			System.out.println(a+b+c);
		}
		
		void add(String fname,String lname) {
			System.out.println(fname+" "+lname);
		}
		
	}


	public class Overload {

		public static void main(String[] args) {
			
			Dummy dummy = new Dummy();
			
			dummy.add(180, 230);
			dummy.add(150, 500,300);
			
			dummy.add("Karthik", "Raju");
			
		}
	}
